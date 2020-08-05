package com.gara.reflect;

/**
 * @description: 基础控制器
 * @author:  GaraYing
 * @createTime: 2020/8/5 14:37
 * @Version: 1.0
**/

public class BaseController {

    private String ip;

    public String address;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
