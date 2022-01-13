package com.belajarspring.models.repos;

import java.util.List;

import com.belajarspring.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
