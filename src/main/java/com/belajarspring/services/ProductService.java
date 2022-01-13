package com.belajarspring.services;

import java.util.List;

import com.belajarspring.models.entities.Product;
import com.belajarspring.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(long id) {
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }
}
