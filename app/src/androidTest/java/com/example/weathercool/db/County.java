package com.example.weathercool.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zongy on 2017/5/5.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
