package com.vietdev.orderservice.service;

import com.vietdev.orderservice.dto.OrderRequestDto;
import com.vietdev.orderservice.model.Order;
import com.vietdev.orderservice.model.OrderLineItems;
import com.vietdev.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderLineItemsService orderLineItemsService;
    public void placeHolder(OrderRequestDto orderRequestDto){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequestDto.getOrderLineItemsDtos()
                .stream().map(orderLineItemsService::mapToOrderLineItems)
                .toList();
        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);
    }
}
