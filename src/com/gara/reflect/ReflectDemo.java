package com.gara.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author GARA
 * @Description 反射
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
        orderServiceField.setAccessible(true);
        String serviceFieldName = orderServiceField.getName();
        System.out.println("orderServiceField: " + serviceFieldName);

        String name = serviceFieldName.substring(0,1).toUpperCase() + serviceFieldName.substring(1, serviceFieldName.length());
        String setName = "set" + name;
        Method method = clazz.getDeclaredMethod(setName, OrderService.class);
        OrderService orderService = new OrderService();
        method.invoke(orderController, orderService); // reflection on OrderController to inject OrderService

        Field[] declaredFields = clazz.getDeclaredFields();
        Arrays.asList(declaredFields).forEach(System.out::println);

        System.out.println("orderService from reflect" + orderController.getOrderService());
    }
}
