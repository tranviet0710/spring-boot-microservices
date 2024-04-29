package com.vietdev.orderservice.controller;

import com.vietdev.orderservice.dto.OrderRequestDto;
import com.vietdev.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequestDto orderRequestDto){
        orderService.placeHolder(orderRequestDto);
        return "Place Order Successfully!";
    }
}
