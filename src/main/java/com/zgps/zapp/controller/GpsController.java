package com.zgps.zapp.controller;

import com.alibaba.fastjson.JSON;
import com.zgps.zapp.entity.GpsInfo;
import com.zgps.zapp.mapper.GpsMapper;
import com.zgps.zapp.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("gps")
public class GpsController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private GpsMapper gpsMapper;

    @PostMapping("/postion")
    @ResponseBody
    public String getBooksByName(@RequestBody Map params)
    {
        System.out.println(new Date()+":"+params.get("latitude")+":"+params.get("longitude"));
        GpsInfo gps = new GpsInfo();
        gps.setLat((Double) params.get("latitude"));
        gps.setLon((Double) params.get("longitude"));
        gps.setUpdateTime(new Date());
        gpsMapper.insert(gps);
        return "ok";
    }

    @GetMapping("/map")
    public String getMap(ModelMap mmap){
        mmap.put("","");
        return "html/map";
    }

    @GetMapping("/test")
    public String testMap(ModelMap mmap){
        List<GpsInfo> lst = gpsMapper.selectList(null);

        mmap.put("data",lst);
        return "html/canvastest";
    }


    @GetMapping("/layer")
    public String layer(ModelMap mmap){
        List<GpsInfo> lst = gpsMapper.selectList(null);

        mmap.put("data",lst);
        return "html/layer";
    }
}
