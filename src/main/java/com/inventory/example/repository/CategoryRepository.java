package com.inventory.example.repository;

import com.inventory.example.domain.Category;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {


    @EntityGraph(attributePaths = "id")
    Optional<Category> findById(Long id);
}
