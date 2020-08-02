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
public class ReflectAnnotationDemo {

    public static void main(String[] args) throws Exception {

        OrderController orderController = new OrderController();
        Class<? extends OrderController> clazz = orderController.getClass();
        Arrays.asList(clazz.getDeclaredFields()).forEach(field -> {
            Autowired autowired = field.getAnnotation(Autowired.class);
            if (autowired != null){
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                try {
//                    fieldType.getConstructor(OrderService.class).newInstance();
                    Object object = fieldType.newInstance();
                    field.set(orderController, object); // implements inject (IOC)
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("orderService from reflect" + orderController.getOrderService());
    }
}
