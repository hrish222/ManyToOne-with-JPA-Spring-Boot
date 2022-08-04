package com.rest.api.Repository;
import com.rest.api.Model.*;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.api.Model.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
    
	@Query(value="select * from employee order by name;",nativeQuery = true)
    public List<Employee> sortByNameAsc();

    @Query(value="select * from employee order by name desc;",nativeQuery = true)
    public List<Employee> sortByNameDesc();
	
    
}
