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

import com.project.Entity.Insurance;
import com.project.Exception.ManagementException;
import com.project.service.InsuranceSerivce;

@RestController
@RequestMapping("/api")
public class InsuranceController {

	@Autowired
	private InsuranceSerivce insure;
	
	@PostMapping("/policies")
	public Insurance saveinsurance(@RequestBody Insurance details)
	{
		return insure.saveinsurance(details);
	}

	@GetMapping("/policies")
	public List<Insurance> fetchinsurance()
	{
		return insure.fetchinsurance();
	}
	
	@GetMapping("/policies/{id}")
	public Insurance fetchinsurancebyid(@PathVariable("id") Long id) throws ManagementException
	{
		return insure.fetchinsurancebyid(id);
	}
	
	@DeleteMapping("/policies/{id}")
	public String deleteinsurance(@PathVariable("id") Long id) throws ManagementException
	{
		insure.deleteinsurance(id);
		return "Insurance Details deleted successfully";
	}
	
	@PutMapping("/policies/{id}")
	public Insurance updateinsurance(@PathVariable("id") Long id, @RequestBody Insurance details) throws ManagementException
	{
		return insure.updateinsurance(id,details);
	}
}
