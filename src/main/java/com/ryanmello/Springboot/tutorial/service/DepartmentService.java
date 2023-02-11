package com.ryanmello.Springboot.tutorial.service;

import com.ryanmello.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getDepartmentList();
}
