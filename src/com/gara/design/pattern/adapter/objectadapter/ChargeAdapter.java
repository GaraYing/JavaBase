package com.gara.design.pattern.adapter.objectadapter;

/**
 * @description: 适配器
 * @author:  GaraYing
 * @createTime: 2020/9/22 11:33
 * @version: 1.0
**/
public class ChargeAdapter {

    private final AndroidAdaptee androidAdaptee;

    private final IosAdaptee iosAdaptee;

    public ChargeAdapter(AndroidAdaptee androidAdaptee, IosAdaptee iosAdaptee) {
        this.androidAdaptee = androidAdaptee;
        this.iosAdaptee = iosAdaptee;
    }

    public void chargeAll(){
        androidAdaptee.chargeMobile();
        iosAdaptee.chargeMobile();
    }
}
