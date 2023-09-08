package com.example.vehicle.serviceimpl;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.vehicle.model.JobCard;
import com.example.vehicle.model.Role;
import com.example.vehicle.repository.JobCardRepository;
import com.example.vehicle.service.JobCardService;
import com.example.vehicle.web.dto.JobCardRegistrationDto;

@Service
public class JobCardServiceImpl implements JobCardService{

	private  JobCardRepository jobCardRepository; 

	
	public JobCardServiceImpl(JobCardRepository jobCardRepository) {
		super();
		this.jobCardRepository = jobCardRepository;
	}
	
	@Override
	public JobCard save(JobCardRegistrationDto jobCardRegistrationDto) {

		JobCard jobCard=new JobCard(jobCardRegistrationDto.getJobId(), jobCardRegistrationDto.getCurDate(),jobCardRegistrationDto.getCustName(),
				jobCardRegistrationDto.getvName(),jobCardRegistrationDto.getvMake(),jobCardRegistrationDto.getPhone(),
				jobCardRegistrationDto.getvInventory(),jobCardRegistrationDto.getsItem(),jobCardRegistrationDto.getCusCompTask(),
				jobCardRegistrationDto.getFrontImg(),jobCardRegistrationDto.getRhSide(),jobCardRegistrationDto.getLhSide(),
				jobCardRegistrationDto.getRearImg(),jobCardRegistrationDto.getDashImg(),jobCardRegistrationDto.getDickyImg(),
				jobCardRegistrationDto.getAssignStaff()) ;
				
		return jobCardRepository.save(jobCard);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		JobCard jobCard= jobCardRepository.findByCustName(username);
		if(jobCard == null) {
			throw new UsernameNotFoundException("Invalid Job Card Details");
		}
		return new org.springframework.security.core.userdetails.User(jobCard.getCustName(),jobCard.getvName(), mapRolesToAuthorities(jobCard.getRoles()));		

	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}


}
