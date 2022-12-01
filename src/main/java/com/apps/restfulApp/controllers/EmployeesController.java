package com.apps.restfulApp.controllers;

import	com.apps.restfulApp.api.model.EmployeeResource;
import  com.apps.restfulApp.service.EmployeeService;

import  io.swagger.annotations.Api;
import  io.swagger.annotations.ApiOperation;
import  io.swagger.annotations.ApiResponse;
import  io.swagger.annotations.ApiResponses;

import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

import  org.springframework.beans.factory.annotation.Autowired;
import 	org.springframework.beans.factory.annotation.Value;

import  org.springframework.http.HttpStatus;
import 	org.springframework.http.MediaType;
import  org.springframework.http.ResponseEntity;

import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestHeader;

import	java.util.List;

@RestController
@Api(value = "Employee(s) resource end points", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeesController {
    private static Logger logger = LoggerFactory.getLogger(EmployeesController.class); 
    
    @Autowired 
    private EmployeeService		empService;

    public EmployeesController() {
    }
    
    @GetMapping(path = "/employees")
    @ApiOperation(value = "Get all employees")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = String.class)})
    public ResponseEntity<List<EmployeeResource>> getAll() throws Exception {
    	List<EmployeeResource> all = empService.findAll();
    	logger.info("Returning all employees data");
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}