package com.apps.restfulApp.service;

import	com.apps.restfulApp.api.model.EmployeeResource;

import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;


import  java.util.ArrayList;
import  java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    public EmployeeServiceImpl() {
    }

	@Override
	public List<EmployeeResource> findAll() throws Exception {
    	ArrayList<EmployeeResource> employees = new ArrayList<>();
    	
        EmployeeResource er = new EmployeeResource();
        er.setId(1137);
        er.setFirstName("Peggie");
        er.setLastName("Bauch");
        	
        employees.add(er);
        
        er = new EmployeeResource();
        er.setId(1138);
        er.setFirstName("Sallie");
        er.setLastName("Borer");
        	
        employees.add(er);
        
        er = new EmployeeResource();
        er.setId(1139);
        er.setFirstName("Dino");
        er.setLastName("Bradtke");
        	
        employees.add(er);
        
        er = new EmployeeResource();
        er.setId(1140);
        er.setFirstName("Antonette");
        er.setLastName("Brown");
        	
        employees.add(er);
        
        er = new EmployeeResource();
        er.setId(1141);
        er.setFirstName("Presley");
        er.setLastName("Conn");
        	
        employees.add(er);         
        
        LOG.info("Returning employee count {}", employees.size());
        return employees;
	}
}