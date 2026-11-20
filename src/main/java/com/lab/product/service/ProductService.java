package com.lab.product.service;

import com.lab.common.exception.ApiException;
import com.lab.product.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ProductService {

    private final Map<Long, ProductDto> productStore = new ConcurrentHashMap<>();

    public ProductService() {
        productStore.put(1L, new ProductDto(1L, "Laptop MacBook Pro M1", 1999.99, "Electronics"));
        productStore.put(2L, new ProductDto(2L, "Wireless Mechanical Keyboard", 149.50, "Accessories"));
        productStore.put(3L, new ProductDto(3L, "Ergonomic Office Mouse", 79.99, "Accessories"));
    }

    public List<ProductDto> getAllProducts() {
        return new ArrayList<>(productStore.values());
    }

    public ProductDto getProductById(Long id) {
        ProductDto product = productStore.get(id);
        if (product == null) {
            throw new ApiException(404, "PRODUCT_NOT_FOUND", "Product not found with id: " + id);
        }
        return product;
    }
}
