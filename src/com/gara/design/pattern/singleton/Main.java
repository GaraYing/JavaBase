package com.gara.design.pattern.singleton;

import javax.crypto.KeyGenerator;
import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @description: 枚举单例模式测试
 *
 * @see DateFormat#getInstance() 
 * @see DateFormat#getDateInstance(int)
 * @see DateFormat#getDateInstance(int, Locale)
 * @see KeyGenerator#getInstance(String)
 * @author: GaraYing
 * @createTime: 2020/8/27 15:03
 * @Version: 1.0
 **/
public class Main {

    public static void main(String[] args) throws Exception {

        EnumSingleton.SINGLETON.doSomething();

        System.out.println("enumInstance:" + EnumSingleton.getInstance().hashCode());
        System.out.println("enumInstance:" + EnumSingleton.getInstance().hashCode());
        System.out.println("enumInstance:" + EnumSingleton.getInstance().hashCode());

        // 反射测试
//        Constructor<EnumSingleton> constructor = EnumSingleton.class.getConstructor();
//        EnumSingleton newInstance = constructor.newInstance(); // throw exception
//        System.out.println("newInstance:" + newInstance.hashCode());
        EnumSingleton singleton = Enum.valueOf(EnumSingleton.class, "SINGLETON");
        EnumSingleton singleton2 = Enum.valueOf(EnumSingleton.class, "SINGLETON");
        System.out.println("enumInstance: " + singleton.getResource());
        System.out.println("enumInstance: " + singleton2.getResource());
        // 序列化/反序列化测试
        File test = new File("test");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(test));
        oos.writeObject(EnumSingleton.getInstance());
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(test));
        EnumSingleton mf4 = (EnumSingleton) ois.readObject();
        ois.close();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(test));
        EnumSingleton mf5 = (EnumSingleton) ois1.readObject();
        ois1.close();
        test.delete();
        System.out.println("enumInstance===" + mf4.hashCode());
        System.out.println("enumInstance===" + mf5.hashCode());

        EnumSingleton.Resource resource = EnumSingleton.SINGLETON.getResource();
        EnumSingleton.Resource resource2 = EnumSingleton.SINGLETON.getResource();

        System.out.println("enumInstance.Resource : " + resource);
        System.out.println("enumInstance.Resource : " + resource2);
    }
}
