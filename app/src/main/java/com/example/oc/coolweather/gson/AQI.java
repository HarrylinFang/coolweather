package com.example.oc.coolweather.gson;

/**
 * Created by OC频道 on 2020/3/9.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
