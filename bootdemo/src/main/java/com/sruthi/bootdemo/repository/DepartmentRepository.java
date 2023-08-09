package com.sruthi.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruthi.bootdemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
