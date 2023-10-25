package com.pratica1.projetoAll.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratica1.projetoAll.entities.User;

@RequestMapping(value = "/users")
@RestController
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria Jose", "mariajose@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}
}
