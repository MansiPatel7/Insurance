package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Claim;
import com.project.Exception.ManagementException;
import com.project.repository.claimRepository;
import com.project.service.ClaimService;

@RestController
@RequestMapping("/api")
public class ClaimController {

	@Autowired
	private ClaimService claim;
	
	@PostMapping("/claim")
	public Claim saveclaim(@RequestBody Claim det)
	{
		return claim.saveclaim(det);
	}
	
	@GetMapping("/claim")
	public List<Claim> fetchclaimdetails()
	{
		return claim.fetchclaimdetails();
	}
	
	@GetMapping("/claim/{id}")
	public Claim fetchclaimbyid(@PathVariable("id") Long id) throws ManagementException
	{
		return claim.fetchclaimbyid(id);
	}
	
	@DeleteMapping("/claim/{id}")
	public String deleteclaimdretails(@PathVariable("id") Long id) throws ManagementException
	{
	claim.deleteclaimdetails(id);
	return "claim details on the id deleted";
	}
	
	@PutMapping("/claim/{id}")
	public Claim updateclientdetails(@PathVariable("id") Long id, @RequestBody Claim det) throws ManagementException
	{
		return claim.uodateclientdetails(id,det);
	}
}
        