package com.ms.repository;

import org.springframework.data.repository.CrudRepository;

import com.ms.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
