package com.swathi.jpasecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swathi.jpasecurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String userName);
}
