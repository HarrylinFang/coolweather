package com.example.oc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by OC频道 on 2020/3/9.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
