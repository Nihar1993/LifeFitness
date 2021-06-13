package com.life.fitness.Service;

import com.life.fitness.Entity.ProductDetails;

import java.util.List;

public interface ProductService {

    List<ProductDetails>getAllProducts();
    ProductDetails findProductById(Integer id);

}
