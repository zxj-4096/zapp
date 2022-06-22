package com.zgps.zapp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class GpsInfo {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private double lat;
    private double lon;
    private Date updateTime;
}
