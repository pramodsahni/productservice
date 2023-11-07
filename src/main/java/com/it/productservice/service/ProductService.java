package com.it.productservice.service;

import com.it.productservice.model.ProductRequest;
import com.it.productservice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
