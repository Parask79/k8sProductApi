package com.nagp.k8s.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagp.k8s.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
}
