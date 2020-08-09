package com.deptempjwtappln.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.deptempjwtappln.model.Department;

public interface DeptPageRepo extends PagingAndSortingRepository<Department, Integer> {

}
	