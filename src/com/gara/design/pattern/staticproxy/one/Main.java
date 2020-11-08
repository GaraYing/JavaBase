package com.gara.design.pattern.staticproxy.one;

import com.gara.design.pattern.staticproxy.one.ProxySubject;
import com.gara.design.pattern.staticproxy.one.RealSubject;
import com.gara.design.pattern.staticproxy.one.Subject;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 16:20
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) {
        Subject subject = new RealSubject("张三");
        Subject proxy = new ProxySubject(subject);
        proxy.request();
    }
}
