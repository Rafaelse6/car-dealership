package com.rafaelsantos.dealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dealership.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
