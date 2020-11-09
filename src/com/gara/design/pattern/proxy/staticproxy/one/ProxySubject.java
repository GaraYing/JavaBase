package com.gara.design.pattern.proxy.staticproxy.one;

/**
 * @Author GARA
 * @Description 代理类
 * @Date 2020/11/8 16:17
 * @Version V1.0.0
 **/
public class ProxySubject implements Subject {

    private final Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        this.doBefore();
        realSubject.request();
        this.doAfter();
    }

    private void doBefore(){
        System.out.println("before request ******");
    }

    private void doAfter(){
        System.out.println("after request ******");
    }
}
