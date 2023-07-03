package com.tmseincman.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmseincman.crud.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
