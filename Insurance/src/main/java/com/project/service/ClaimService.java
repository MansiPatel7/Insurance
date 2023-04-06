package com.project.service;

import java.util.List;

import com.project.Entity.Claim;
import com.project.Exception.ManagementException;

public interface ClaimService {
	
	Claim saveclaim(Claim det);
	
	List<Claim> fetchclaimdetails();
	
	Claim fetchclaimbyid(Long id) throws ManagementException;

	void deleteclaimdetails(Long id) throws ManagementException;
	
	Claim uodateclientdetails(Long id, Claim det) throws ManagementException;

}
