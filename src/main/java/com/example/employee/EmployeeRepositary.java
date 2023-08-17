package com.example.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface EmployeeRepositary extends JpaRepository<EmployeeDetails,Long>{

	

}


