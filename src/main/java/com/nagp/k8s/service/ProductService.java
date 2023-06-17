package com.nagp.k8s.service;


import com.nagp.k8s.entity.Products;
import com.nagp.k8s.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    

    @GetMapping
    public List<Products> getOrders(){
        return repository.findAll();
    }

    
    public List<Products> setInitialData(List<Products> productList){
        return repository.saveAll(productList);
     }
}
