package com.ms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ms.controller.EmployeeMapper;
import com.ms.domain.Employee;
import com.ms.model.EmpDTO;
import com.ms.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;

	@Autowired
	private EmployeeMapper empMapper;

	public List<EmpDTO> getAll() {
		log.debug("==================== Get All Employees =========== ");
		List<Employee> empRecords = new ArrayList<>();
		empRepository.findAll().forEach(empRecords::add);
		return empRecords.stream().map(f -> empMapper.employeeToDto(f)).collect(Collectors.toList());

	}

	public EmpDTO add(EmpDTO empRecord) {
		log.debug("Saving Employee " + empRecord.toString());
		return empMapper.employeeToDto(empRepository.save(empMapper.dtoToEmployee(empRecord)));
	}

	public EmpDTO update(EmpDTO empRecord) {
		log.debug("Updating Employee " + empRecord.toString());
		return empMapper.employeeToDto(empRepository.save(empMapper.dtoToEmployee(empRecord)));
	}

	public void delete(Long id) {
		log.debug("Delete Employee " + id);
		empRepository.deleteById(id);
	}

	public EmpDTO getById(Long id) {
		log.debug("Get Employee " + id);
		return empMapper.employeeToDto(empRepository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee Not Found. UUID: " + id)));

	}

}