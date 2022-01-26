package com.ms.controller;

import com.ms.domain.Employee;
import com.ms.domain.Employee.EmployeeBuilder;
import com.ms.model.EmpDTO;
import com.ms.model.EmpDTO.EmpDTOBuilder;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmpDTO employeeToDto(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmpDTOBuilder empDTO = EmpDTO.builder();

        empDTO.id( emp.getId() );
        empDTO.name( emp.getName() );
        empDTO.salary( emp.getSalary() );
        empDTO.designation( emp.getDesignation() );

        return empDTO.build();
    }

    @Override
    public Employee dtoToEmployee(EmpDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmployeeBuilder employee = Employee.builder();

        if ( dto.getId() != null ) {
            employee.id( dto.getId() );
        }
        employee.name( dto.getName() );
        employee.salary( dto.getSalary() );
        employee.designation( dto.getDesignation() );

        return employee.build();
    }
}