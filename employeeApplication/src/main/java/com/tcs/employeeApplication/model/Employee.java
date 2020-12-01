package com.tcs.employeeApplication.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "employee_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "organization_id")
	private Long organizationId;
//	
//	@ManyToOne(fetch =FetchType.LAZY)
//	@JoinColumn(name = "department_id")
	private Long departmentId;
	
	private String name;
	private int age;
	private String position;
}