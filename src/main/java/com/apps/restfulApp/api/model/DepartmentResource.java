package com.apps.restfulApp.api.model;

import	lombok.Getter;
import	lombok.Setter;
import	lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class DepartmentResource {
	private int id;
	private String departmentName;
	private String departmentCode;
}