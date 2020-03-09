package com.example.oc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by OC频道 on 2020/3/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
