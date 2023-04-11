package com.inventory.example.repository;

import com.inventory.example.domain.Product;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @EntityGraph(attributePaths = {"warehouses","categories"})
     List<Product> findAll();


    @EntityGraph(attributePaths = {"warehouses","categories"})
    Optional<Product> findById(Long id);
}
