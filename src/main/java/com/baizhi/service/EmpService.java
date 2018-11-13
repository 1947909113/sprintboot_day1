package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
	 List<Emp> queryAll();
	
	 void delete(Emp emp);
	
	 void insert(Emp emp);
	
	 void update(Emp emp);
}
