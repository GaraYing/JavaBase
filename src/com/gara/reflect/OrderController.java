package com.gara.reflect;

/**
 * @Author GARA
 * @Description OrderController
 * @Date 2020/8/1 21:03
 * @Version V1.0.0
 **/
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    public String orderId;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
