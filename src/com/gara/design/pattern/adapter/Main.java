package com.gara.design.pattern.adapter;

import com.gara.design.pattern.adapter.classadapter.ChildAdapter;
import com.gara.design.pattern.adapter.classadapter.Target;
import com.gara.design.pattern.adapter.objectadapter.AndroidAdaptee;
import com.gara.design.pattern.adapter.objectadapter.ChargeAdapter;
import com.gara.design.pattern.adapter.objectadapter.IosAdaptee;

/**
 * @description: 适配器模式
 * @author:  GaraYing
 * @createTime: 2020/9/22 14:15
 * @version: 1.0
**/
public class Main {
    public static void main(String[] args) {
        // 对象适配器
        new ChargeAdapter(new AndroidAdaptee(), new IosAdaptee()).chargeAll();
        System.out.println("===============================================");
        // 类适配器
        new ChildAdapter(new Target()).request();
    }
}
