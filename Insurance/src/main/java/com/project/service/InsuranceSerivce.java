package com.project.service;

import java.util.List;

import com.project.Entity.Insurance;
import com.project.Exception.ManagementException;

public interface InsuranceSerivce {

	Insurance saveinsurance(Insurance details);

	List<Insurance> fetchinsurance();

	void deleteinsurance(Long id) throws ManagementException;

	Insurance fetchinsurancebyid(Long id) throws ManagementException;

	Insurance updateinsurance(Long id, Insurance details) throws ManagementException;

}
