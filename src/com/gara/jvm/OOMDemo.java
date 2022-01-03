package com.gara.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author GARA
 * @description OutOfMemoryError -Xms500m -Xmx500m
 * @date 2022/1/3 18:28
 */
public class OOMDemo {
    public static void main(String[] args) {
        List<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

