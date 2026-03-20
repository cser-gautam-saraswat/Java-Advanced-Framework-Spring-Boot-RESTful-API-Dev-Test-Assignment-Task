package com.capgemini.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.capgemini.model.entity.Employee;

@RepositoryRestController
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}