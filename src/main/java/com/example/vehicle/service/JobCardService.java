package com.example.vehicle.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.vehicle.model.JobCard;
import com.example.vehicle.web.dto.JobCardRegistrationDto;

public interface JobCardService extends UserDetailsService{

	JobCard save(JobCardRegistrationDto jobCardRegistrationDto);
}
