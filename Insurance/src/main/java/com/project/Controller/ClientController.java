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

import com.project.Entity.Client;
import com.project.Exception.ManagementException;
import com.project.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private ClientService client;
	
	@PostMapping("/clients")
    public Client saveclients(@RequestBody Client details)
    {
		return client.saveclients(details);
    }
	
	@GetMapping("/clients")
	public List<Client> fetchclients()
	{
		return client.fetchclient();
	}
	
	@GetMapping("/clients/{id}")
	public Client fetchclientbyid(@PathVariable("id") Long id) throws ManagementException
     {
	return client.fetchclientbyid(id);
    }
	
	@DeleteMapping("/clients/{id}")
	public String deletebyid(@PathVariable("id") Long id) throws ManagementException
	{
		
	   client.deletebyid(id);
	   return "Client details deleted successfully";
	
	}
	
	@PutMapping("/clients/{id}")
	public Client updateclient(@PathVariable("id") Long id, @RequestBody Client details) throws ManagementException
	{
		return client.updateclient(id,details);
	}
}
