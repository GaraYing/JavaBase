package com.gara.reflect;

import java.util.Arrays;

/**
 * @Author GARA
 * @Description 反射 Spring IOC底层实现核心逻辑
 * @Date 2020/8/1 21:02
 * @Version V1.0.0
 **/
public class ReflectAnnotationDemo {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName(OrderController.class.getName());
        Class<OrderController> controllerClass = OrderController.class;
        OrderController orderController = new OrderController();
        Class<? extends OrderController> clazz = orderController.getClass();
        System.out.println("simpleName: " + clazz.getSimpleName());
        System.out.println("name: " + clazz.getName());
        System.out.println("canonicalName: " + clazz.getCanonicalName());
        System.out.println("equals: " + clazz.getName().equalsIgnoreCase(controllerClass.getName()));
        System.out.println("equals: " + clazz.getName().equalsIgnoreCase(aClass.getCanonicalName()));
        Arrays.asList(clazz.getDeclaredFields()).forEach(field -> {
            Autowired autowired = field.getAnnotation(Autowired.class);
            if (autowired != null){
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                try {
//                    fieldType.getConstructor(OrderService.class).newInstance();
                    Object object = fieldType.newInstance();
                    field.set(orderController, object); // implements inject (IOC)
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("orderService from reflect" + orderController.getOrderService());
    }
}
