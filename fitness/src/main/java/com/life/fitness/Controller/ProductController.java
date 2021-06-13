package com.life.fitness.Controller;

import com.life.fitness.Entity.ProductDetails;
import com.life.fitness.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/api/fitness")
public class ProductController {
   @Autowired
   private ProductService productService;

    @GetMapping("/all/products")
    public ModelAndView showAllProducts() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("userClickAllProducts", true);
        modelAndView.addObject("title", "All Products");

        // passing the list of categories

        modelAndView.addObject("categories", productService.getAllProducts());

        return modelAndView;
    }

    @GetMapping("/show/{id}/product")
    public ModelAndView showSingleProduct(@PathVariable("id") int id) throws ProductNotFoundExceptoion {

        ModelAndView modelAndView = new ModelAndView("page");

        ProductDetails product = productService.findProductById(id);

        if (product == null)
            throw new ProductNotFoundExceptoion();

        modelAndView.addObject("title", product.getName());
        modelAndView.addObject("product", product);

        return modelAndView;

    }
}
