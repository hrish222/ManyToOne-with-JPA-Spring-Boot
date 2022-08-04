package com.rest.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.Model.Employee;
import com.rest.api.Service.EmployeeService;

@RestController
public class EmployeeController {

	  @Autowired
	    private EmployeeService employeeService;
	 
	  @GetMapping("/getallemployees")
	    public List<Employee> getAllEmployee(){
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/employee/{id}")
	    public Employee getEmployee(@PathVariable ("id") int id){
	        return employeeService.getEmployeeById(id);
	    }

	    @PostMapping("/createEmployee")
	    public void addEmployees(@RequestBody Employee employee){
	        System.out.println(employee);
	        employeeService.addEmployees(employee);
	    }

	    @PutMapping("/Updateemployee/{id}")
	    public void updateEmployee(@RequestBody Employee employee, @PathVariable ("id") int id){
	        System.out.println(employee);
	        employeeService.updateEmployee(employee, id);
	    }

	    @DeleteMapping("/DeleteEmployee/{id}")
	    public void deleteEmployeeByID(@PathVariable ("id") int id){
	        employeeService.deleteEmployeeByID(id);
	    }
	    @GetMapping("/SortingNameasc")
	    public List<Employee> sortByEmpNameAsc(){
	        return employeeService.sortByEmpNameAsc();
	    }

	    @GetMapping("/SortingNamedesc")
	    public List<Employee> sortByEmpNameDesc(){
	        return employeeService.sortByEmpNameDesc();
	    }
	   
}
