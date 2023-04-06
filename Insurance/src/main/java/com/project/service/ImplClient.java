package com.project.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Client;
import com.project.Exception.ManagementException;
import com.project.repository.clientRepository;

@Service
public class ImplClient implements ClientService{

	@Autowired
	private clientRepository repository;
	
	@Override
	public Client saveclients(Client details) {
		return repository.save(details);
	}

	@Override
	public List<Client> fetchclient() {
		return repository.findAll();
		}

	@Override
	public Client fetchclientbyid(Long id) throws ManagementException {
		Optional<Client> opt=repository.findById(id);
		if(!opt.isPresent())
		{
			throw new ManagementException("Client is not avaible in this id");
		}
			return opt.get();
		
	}

	@Override
	public void deletebyid(Long id) throws ManagementException {
		Optional<Client> opt=repository.findById(id);
		if(opt.isPresent())
		{
			opt.get();
			repository.deleteById(id);
		}
		else
		{
			throw new ManagementException("Client is not avaible in this id");
		}
		
	}

	@Override
	public Client updateclient(Long id, Client details) throws ManagementException {
		Optional<Client> opt=repository.findById(id);
		if(opt.isPresent())
	 {
			Client det=opt.get();
		
			det.setName(details.getName());
		
		
			det.setAddress(details.getAddress());
		
		
			det.setDob(details.getDob());
		
		
			det.setContact(details.getContact());
		
		return repository.save(det);
	 }
		else
		{
			throw new ManagementException("Client is not avaible in this id");
		}
		
	}

}
