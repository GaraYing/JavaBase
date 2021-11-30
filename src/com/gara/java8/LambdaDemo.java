package com.gara.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @description: lambda表达式
 * @author:  Gara
 * @createTime: 2020/1/16 17:00
 * @Version: 1.0
**/
public class LambdaDemo {

    public static void main(String[] args) {
        List<UserInfo> list = new ArrayList<>(10);
        UserInfo userInfo1 = new UserInfo(20, "jack" , 1, "SINGING");
        UserInfo userInfo2 = new UserInfo(24, "Rose" , 1, "SINGING");
        UserInfo userInfo3 = new UserInfo(18, "Jane" , 0, "BALL");
        list.add(userInfo1);
        list.add(userInfo2);
        list.add(userInfo3);
        list.stream().sorted(Comparator.comparing(UserInfo::getAge)).forEach(e-> System.out.println("e = " + e));

    }
}
