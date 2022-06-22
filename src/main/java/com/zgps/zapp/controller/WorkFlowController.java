package com.zgps.zapp.controller;

import com.zgps.zapp.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("workflow")
public class WorkFlowController {

    private String prefix = "html";

    @GetMapping("map")
    public String getx6()
    {
        System.out.println(new Date()+":");
        return "html/map";
    }


}
