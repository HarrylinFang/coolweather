package com.example.oc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by OC频道 on 2020/3/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
