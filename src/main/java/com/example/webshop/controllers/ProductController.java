package com.example.webshop.controllers;

import com.example.webshop.entity.Product;
import com.example.webshop.entity.View;
import com.example.webshop.services.ProductService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class ProductController {

    public final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    @JsonView(View.Product.class)
    public List<Product> getPoints(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        return productService.getProducts();
    }

}
