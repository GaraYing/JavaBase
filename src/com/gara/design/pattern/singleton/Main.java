package com.gara.design.pattern.singleton;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("enumInstance:" + EnumSingleton.getInstance());
        System.out.println("enumInstance:" + EnumSingleton.getInstance());
        System.out.println("enumInstance:" + EnumSingleton.getInstance());
    }
}
