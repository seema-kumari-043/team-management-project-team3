package com.seema.teammanagement.service;

import java.util.List;
import java.util.UUID;

import com.seema.teammanagement.exceptions.userNotFoundException;

import com.seema.teammanagement.model.Employee;
import com.seema.teammanagement.repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {

        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {

        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new userNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);// employeeRepo.deleteById(id);
    }

}
