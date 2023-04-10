package com.inventory.example.repository;

import com.inventory.example.domain.Product;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @EntityGraph(attributePaths = {"categories,warehouses"})
     List<Product> findAll();

}
