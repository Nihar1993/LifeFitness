package com.life.fitness.Repo;

import com.life.fitness.Entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<ProductDetails,Integer> {
    List<ProductDetails> findAll();
    //ProductDetails findProductById(Integer id);


}
