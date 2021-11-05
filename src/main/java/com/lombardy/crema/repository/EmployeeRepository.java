package com.lombardy.crema.repository;

import com.lombardy.crema.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}


