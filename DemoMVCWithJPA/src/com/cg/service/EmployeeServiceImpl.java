package com.cg.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employee;

@Service("eser")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao edao;
	@Override
	public int insertEmp(Employee emp) {
		return edao.insertEmployee(emp);
	}

}
