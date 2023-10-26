package com.pratica1.projetoAll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica1.projetoAll.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
