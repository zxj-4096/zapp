package com.zgps.zapp.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GpsData {
    private Integer id;
    private Float latitude;//: 37.810375,
    private Float longitude;//": 112.597023,
    private Float altitude;//": 0.0,
    private Float accuracy;//": 40.0,
    private Float verticalAccuracy;//": 0.0,
    private Float bearing;//": 0.0,
    private Float speed;//": 0.0,
    private Float elapsedMs;//": 12,
    private String provider; //"network"
    private Date updateTime;
}
