package com.example.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeemanager.model.Employee;

// <Class the repository is for, type of the primary key>
public interface EmployeeRepo extends JpaRepository<Employee, Long>
{

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
