package com.inventory.example.repository;

import com.inventory.example.domain.Category;
import com.inventory.example.domain.Warehouse;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {


    @EntityGraph(attributePaths = "id")
    Optional<Warehouse> findById(Long id);
}
