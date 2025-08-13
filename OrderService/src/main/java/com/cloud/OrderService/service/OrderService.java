package com.cloud.OrderService.service;

import com.cloud.OrderService.model.OrderRequest;
import com.cloud.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
