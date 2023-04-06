package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Claim;
import com.project.Exception.ManagementException;
import com.project.repository.claimRepository;

@Service
public class ImplClaimService implements ClaimService{

	@Autowired
	private claimRepository repoclaim;

	@Override
	public Claim saveclaim(Claim det) {
		return repoclaim.save(det);
	}

	@Override
	public List<Claim> fetchclaimdetails() {
		return repoclaim.findAll();
	}

	@Override
	public Claim fetchclaimbyid(Long id) throws ManagementException {
		Optional<Claim> opt= repoclaim.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		throw new ManagementException("No detail is present in this department id ");
	}

	@Override
	public void deleteclaimdetails(Long id) throws ManagementException {
		Optional<Claim> opt= repoclaim.findById(id);
		if(!opt.isPresent())
		{
		throw new ManagementException("No detail is present in this department id ");
		}
		opt.get();
		repoclaim.deleteById(id);
	}

	@Override
	public Claim uodateclientdetails(Long id, Claim det) throws ManagementException {
		Optional<Claim> opt= repoclaim.findById(id);
		if(opt.isPresent())
		{
			Claim claim=opt.get();
			claim.setClaimNumber(det.getClaimNumber());
			claim.setDescription(det.getDescription());
			claim.setClaimDate(det.getClaimDate());
			claim.setClaimStatus(det.getClaimStatus());
			claim.setInsurancePolicy(det.getInsurancePolicy());
			
			return repoclaim.save(claim);
		}
		
		throw new ManagementException("No detail is present in this department id ");
	}
	
	

}
