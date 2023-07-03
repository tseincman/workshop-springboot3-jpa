package com.tmseincman.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmseincman.crud.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
