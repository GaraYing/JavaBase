package com.gara.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author GARA
 * @Description 反射
 *      1. getDeclaredXX不包括父类的方法，专注于获取本类的所有方法（包括public和非public）{@link Class#getDeclaredFields()} ()}
 *      2. getXX包括派生链上所有父类和本类的所有public方法（只能是public） {@link Class#getFields()}
 * @Date 2020/8/1 21:02
 * @Version V1.0.0
 **/
public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        OrderController orderController = new OrderController();
        Class<? extends OrderController> clazz = orderController.getClass();
        // get all fields
        Field[] fields = clazz.getFields();
        Arrays.asList(fields).forEach(System.out::println); // public java.lang.String com.gara.reflect.OrderController.orderId

        Field orderServiceField = clazz.getDeclaredField("orderService");
        //orderServiceField.setAccessible(true);
        String serviceFieldName = orderServiceField.getName();
        System.out.println("orderServiceField: " + serviceFieldName);

        String name = serviceFieldName.substring(0,1).toUpperCase() + serviceFieldName.substring(1);
        String setName = "set" + name;
        Method method = clazz.getDeclaredMethod(setName, OrderService.class);
        OrderService orderService = new OrderService();
        method.invoke(orderController, orderService); // reflection on OrderController to inject OrderService

        Field[] declaredFields = clazz.getDeclaredFields();
        Arrays.asList(declaredFields).forEach(System.out::println);

        System.out.println("orderService from reflect" + orderController.getOrderService());

        Class<?> superclass = clazz.getSuperclass();
        if (superclass != null){
            Field ip = superclass.getDeclaredField("ip");
            Field address = superclass.getField("address");
            Object ipName = ip.getName();
            Object addressName = address.getName();
            System.out.println(ipName + "::" + addressName);
        }

    }
}
