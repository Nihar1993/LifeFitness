package com.life.fitness.Service;

import com.life.fitness.Entity.ProductDetails;
import com.life.fitness.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@EnableJpaRepositories(basePackages = "com.life.fitness.Repo")
public class ProductServiceImpl implements ProductService{
    @Autowired
    private  ProductRepository repository;
    @Override
    public List<ProductDetails> getAllProducts() {
        // TODO Auto-generated method stub
        List<ProductDetails> products =  repository.findAll();
        return products;
    }
    @Override
    public ProductDetails findProductById(Integer id) {
        // TODO Auto-generated method stub
       // ProductDetails product = repository.findProductById(id);
        ProductDetails product = repository.getOne(id);

        //return product;
        return product;
    }
}
