package com.ms.controller;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.model.EmpDTO;
import com.ms.service.EmployeeService;  

@RestController
@RequestMapping("/api/")
public class EmployeeController 
{  
    @Autowired  
    private EmployeeService empService;   
    
    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public EmpDTO save(@RequestBody EmpDTO empRecord){
    	return empService.add(empRecord);
    }

    @GetMapping("{id}")
    public EmpDTO getOrder(@PathVariable("id") long id){
        return empService.getById(id);
    }

    @DeleteMapping("delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id){
    	empService.delete(id);
    }
    
    @GetMapping("all")
    public List<EmpDTO> all(){
    	return empService.getAll();
    }
    
}  
