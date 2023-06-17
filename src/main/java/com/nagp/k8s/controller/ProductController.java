package com.nagp.k8s.controller;


import com.nagp.k8s.entity.Products;
import com.nagp.k8s.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService service;

   

    @GetMapping("/products")
    public List<Products> getOrders(){
        return service.getOrders();
    }

    
    @GetMapping("/initialData")
    public List<Products> setInitialData(){
    	
    	Products first = new Products(1, "TV", "Samsung"); 
    	Products first1 = new Products(2, "AC", "LG");
   	    Products first2 = new Products(3, "Washing Machine","LG");
   	    Products first3 = new Products(4, "Fridge", "Whirlpool"); 
   	    Products first4 = new Products(5, "Mobile", "Apple"); 
   	    Products first5 = new Products(6, "Fan", "Havells"); 
   	    Products first6 = new Products(7, "Geysor", "Bajaj"); 
   	    List<Products> list = Arrays.asList(first,first1, first2, first3,
   			  first4, first5, first6); 
        return service.setInitialData(list);
    }
    
}
