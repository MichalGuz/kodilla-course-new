package com.kodilla.good.patterns.food.to.door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto orderProcess(final OrderRequest orderRequest) {
        boolean ordered = orderService.order(FoodToDoorOrderService.EXTRA_FOOD_SHOP, orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderData());
        if(ordered) {informationService.inform(orderRequest.getUser());
            boolean order = orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderData());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
