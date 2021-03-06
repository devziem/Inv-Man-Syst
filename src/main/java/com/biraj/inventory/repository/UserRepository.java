package com.biraj.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.biraj.inventory.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserid(String userid); 

}