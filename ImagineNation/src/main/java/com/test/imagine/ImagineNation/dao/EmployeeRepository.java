package com.test.imagine.ImagineNation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.imagine.ImagineNation.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
