package com.zyp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 81235 on 2017/4/5.
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
