package com.zgps.zapp;

import com.zgps.zapp.entity.GpsInfo;
import com.zgps.zapp.entity.User;
import com.zgps.zapp.mapper.GpsMapper;
import com.zgps.zapp.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ZappApplicationTests {


    @Resource
    private UserMapper userMapper;

    @Resource
    private GpsMapper gpsMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assertions.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }

    @Test
    public void testGps() {
        System.out.println(("----- selectAll method test ------"));
//        GpsInfo gps = new GpsInfo();
//        gpsMapper.insert(gps);
//        Assertions.assertEquals(gps.getId(),null);
    }

}
