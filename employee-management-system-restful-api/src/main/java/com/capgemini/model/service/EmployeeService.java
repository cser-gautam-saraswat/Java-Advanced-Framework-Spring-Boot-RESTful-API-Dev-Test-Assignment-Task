package com.capgemini.model.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		System.out.println("Employee Saved Successfully!");
	}
	
	public void saveEmployees(List<Employee> employees) {
		employeeRepository.saveAll(employees);
		System.out.println("Employee Saved Successfully!");
	}
	
	public Employee getEmployee(Integer id) {
		return employeeRepository.findById(id).get();
	}
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Integer id, Employee newEmployee) {
		Employee existing = employeeRepository.findById(id).get();
		
		if(newEmployee != null) {
			if(existing != null) {
				existing.setName(newEmployee.getName());
				existing.setMailId(newEmployee.getMailId());
				existing.setContactNumber(newEmployee.getContactNumber());
			}
		}
		return employeeRepository.save(existing);
	}
	
	public void deleteEmployee(Integer id) {
		Employee existing = employeeRepository.findById(id).get();
		employeeRepository.deleteById(id);
	}
	
	public Employee patchEmployee(Integer id, Map<String, Object> updates) {
		 Employee existing = employeeRepository.findById(id).get();
		            

		    for (Map.Entry<String, Object> entry : updates.entrySet()) {

		        String key = entry.getKey();
		        Object value = entry.getValue();
		        
		        if (key.equals("name")) {
		            existing.setName((String) value);
		        } 
		        if (key.equals("mailId")) {
		            existing.setMailId((String) value);
		        } 
		        if (key.equals("contactNumber")) {
		            existing.setContactNumber((Long) value);
		        }
		    }
		    return employeeRepository.save(existing);
	}
}