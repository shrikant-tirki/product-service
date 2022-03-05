package com.bel.training.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bel.training.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
