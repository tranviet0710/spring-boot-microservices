package com.vietdev.productservice.service;

import com.vietdev.productservice.dto.ProductRequest;
import com.vietdev.productservice.dto.ProductResponse;
import com.vietdev.productservice.model.Product;
import com.vietdev.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

    public Product mapToProduct(ProductRequest productRequest){
        return Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }

    public void createProduct(ProductRequest productRequest) {
        Product product = mapToProduct(productRequest);
        productRepository.save(product);
        log.info("Product {} is saved.", product.getId());
    }
}
