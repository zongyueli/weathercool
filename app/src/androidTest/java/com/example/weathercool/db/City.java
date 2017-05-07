package com.example.weathercool.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zongy on 2017/5/5.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int privinceId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getPrivinceId() {
        return privinceId;
    }

    public void setPrivinceId(int privinceId) {
        this.privinceId = privinceId;
    }
}
