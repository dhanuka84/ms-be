package com.ms.controller;

import org.mapstruct.Mapper;

import com.ms.domain.Employee;
import com.ms.model.EmpDTO;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	EmpDTO employeeToDto(Employee emp);

	Employee dtoToEmployee(EmpDTO dto);
}
