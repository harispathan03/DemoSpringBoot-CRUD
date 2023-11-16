package com.haris.SpringBootDemo.service;

import com.haris.SpringBootDemo.entity.Department;
import com.haris.SpringBootDemo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchAllDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    String deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
