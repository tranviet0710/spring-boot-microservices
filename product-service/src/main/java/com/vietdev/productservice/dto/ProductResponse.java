package com.vietdev.productservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductResponse {
    private String name;
    private String description;
    private BigDecimal price;
}
