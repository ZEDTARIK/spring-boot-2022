package com.example.apps.ws.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apps.ws.requests.UserRequest;
import com.example.apps.ws.responses.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public String getUser() {
		return "get user";
	}

	/*
	 *  Deserializable
	 */
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		return null;
	}

	@PutMapping
	public String updateUser() {
		return "update user";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}

}
