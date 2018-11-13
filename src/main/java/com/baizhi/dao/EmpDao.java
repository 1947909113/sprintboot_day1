package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpDao {
	 List<Emp> queryAll();
	
	 void delete(Emp emp);
	
	 void insert(Emp emp);
	
	 void update(Emp emp);
}
