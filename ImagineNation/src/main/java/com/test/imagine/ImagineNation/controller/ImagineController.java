package com.test.imagine.ImagineNation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.imagine.ImagineNation.dao.EmployeeRepository;
import com.test.imagine.ImagineNation.dao.PhoneRepository;
import com.test.imagine.ImagineNation.model.Employee;
import com.test.imagine.ImagineNation.model.Phone;

@RestController
@RequestMapping("/imagine")
public class ImagineController {
	
	@Autowired
	private EmployeeRepository empRep;
	
	@Autowired
	private PhoneRepository phoneRep;
	
	@RequestMapping(value = "/getAllPhones", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAllPhones() {
	    List<Phone> phoneList=phoneRep.findAll();
	    System.out.println("Got All Phones"+phoneList) ;
	    for(Phone phone:phoneList)
	    {
	    	System.out.println("Got Phone Owner"+phone.getEmp()) ;
	    }
	    
	    return "SUCCESS";
	 
	}
	
	@RequestMapping(value = "/getEmployeeById/"
			+ "{id}")
	public String getEmployeeById(@PathVariable Integer id) {
	    Employee emp=empRep.findById(id).get();
	    System.out.println("Got Employee"+emp) ;
	    return "SUCCESS";
	}
	
	
	
	@RequestMapping(value = "/getAllEmployees")
	public String getAllEmployees() {
	    List<Employee> empList=empRep.findAll();
	    System.out.println("Got All Employees"+empList) ;
	    for(Employee emp:empList)
	    {
	    	System.out.println("Got Emp Phones"+emp.getPhoneList()) ;
	    }
	    
	    return "SUCCESS";
	 
	  //  return new ResponseEntity<List<Employee>>(empList, new HttpHeaders(), HttpStatus.OK);
	}

}
