package com.example.vehicle.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.vehicle.model.User;
import com.example.vehicle.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
