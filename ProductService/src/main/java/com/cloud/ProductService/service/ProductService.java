package com.cloud.ProductService.service;

import com.cloud.ProductService.model.ProductRequest;
import com.cloud.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
