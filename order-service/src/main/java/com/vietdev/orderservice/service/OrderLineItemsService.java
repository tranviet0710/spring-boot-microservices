package com.vietdev.orderservice.service;

import com.vietdev.orderservice.dto.OrderLineItemsDto;
import com.vietdev.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

@Service
public class OrderLineItemsService {
    public OrderLineItems mapToOrderLineItems(OrderLineItemsDto orderLineItemsDto){
        return OrderLineItems.builder()
                .skuCode(orderLineItemsDto.getSkuCode())
                .price(orderLineItemsDto.getPrice())
                .quantity(orderLineItemsDto.getQuantity())
                .build();
    }
}
