package com.example.vehicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vehicle.service.JobCardService;
import com.example.vehicle.web.dto.JobCardRegistrationDto;

@Controller
@RequestMapping("/jobcard")
public class JobCardRegistrationController {
	
	private JobCardService jobCardService;

	public JobCardRegistrationController(JobCardService jobCardService) {
		super();
		this.jobCardService = jobCardService;
	}
	
	@ModelAttribute("JobCard")
	public JobCardRegistrationDto jobCardRegistrationDto() {
		return new JobCardRegistrationDto();
		
	}
	
	@GetMapping
	public String showJobCardForm() {
		return "jobcard";
		
	}
	
	@PostMapping
	public String registerJobCardAccount(@ModelAttribute("JobCard") JobCardRegistrationDto jobCardRegistrationDto) {
		jobCardService.save(jobCardRegistrationDto);
		return "redirect:/jobcard?success";
		
	}
}
