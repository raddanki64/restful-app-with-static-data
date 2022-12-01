package com.apps.restfulApp.service;

import 	java.util.List;

import 	com.apps.restfulApp.api.model.EmployeeResource;

public interface EmployeeService {
	public List<EmployeeResource> findAll() throws Exception;
}
