package com.rest.api.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.Model.Employee;
import com.rest.api.Repository.EmployeeRepository;



	@Service
	public class EmployeeService {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    //get all the employees
	    public List<Employee> getAllEmployees(){
	        List<Employee> employees = (List<Employee>)employeeRepository.findAll();
	        return employees;
	    }

	    public Employee getEmployeeById(int id){
	        return employeeRepository.getById(id);
	    }

	    //add new employee
	    public void addEmployees(Employee employee) {
	        employeeRepository.save(employee);
	    }

	    //update employee by id
	    public void updateEmployee(Employee employee, int id){
	        if(id == employee.getId()) {
	            employeeRepository.save(employee);
	        }
	    }

	    //delete employee by id
	    public void deleteEmployeeByID(int id){
	        employeeRepository.deleteById(id);
	    }

	    public void patchEmployee(Employee emp, int id) {
	        if(id == emp.getId()) {
	            employeeRepository.save(emp);
	        }
	    
	    }
	    
	    public List<Employee> sortByEmpNameAsc(){
	        return employeeRepository.sortByNameAsc();
	    }

	    public List<Employee> sortByEmpNameDesc(){
	        return employeeRepository.sortByNameDesc();
	    }
	}


