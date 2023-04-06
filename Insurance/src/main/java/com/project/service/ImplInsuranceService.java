package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Insurance;
import com.project.Exception.ManagementException;
import com.project.repository.insuranceRepository;

@Service
public class ImplInsuranceService implements InsuranceSerivce {

	@Autowired
	private insuranceRepository insrepo;
	
	
	@Override
	public Insurance saveinsurance(Insurance details) {
		return insrepo.save(details);
	}


	@Override
	public List<Insurance> fetchinsurance() {
		return insrepo.findAll();
		}


	@Override
	public void deleteinsurance(Long id) throws ManagementException {
		Optional<Insurance> opt=insrepo.findById(id);
		if(!opt.isPresent())
		{
			throw new ManagementException("No detail is present in this department id ");
		}
		opt.get();
		insrepo.deleteById(id);
	}


	@Override
	public Insurance fetchinsurancebyid(Long id) throws ManagementException {
		Optional<Insurance> opt=insrepo.findById(id);
		if(!opt.isPresent())
		{
			throw new ManagementException("Nodetails inm this department id is present");
		}
		return opt.get();
	}


	@Override
	public Insurance updateinsurance(Long id, Insurance details) throws ManagementException {
        Optional<Insurance> opt=insrepo.findById(id);
        if(opt.isPresent())
        {
            Insurance insurance = opt.get();
            insurance.setPolicyNumber(details.getPolicyNumber());
            insurance.setType(details.getType());
            insurance.setCoverageAmount(details.getCoverageAmount());
            insurance.setPremium(details.getPremium());
            insurance.setStartDate(details.getStartDate());
            insurance.setEndDate(details.getEndDate());
            insurance.setClient(details.getClient());
            
           return  insrepo.save(insurance);
        }
        throw new ManagementException("Nodetails in this department id is present");
	}

}
