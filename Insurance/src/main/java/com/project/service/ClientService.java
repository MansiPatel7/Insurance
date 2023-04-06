package com.project.service;

import java.util.List;

import com.project.Entity.Client;
import com.project.Exception.ManagementException;

public interface ClientService {

	Client saveclients(Client details);

	List<Client> fetchclient();

	Client fetchclientbyid(Long id) throws ManagementException;

	void deletebyid(Long id) throws ManagementException;

	Client updateclient(Long id, Client details) throws ManagementException;

	

	

}
