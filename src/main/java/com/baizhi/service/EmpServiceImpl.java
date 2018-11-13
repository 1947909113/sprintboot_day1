package com.baizhi.service;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;
	
	@Transactional(readOnly=true)
	@Override
	/*@Log(name="queryAll")*/
	public List<Emp> queryAll() {
		System.out.println("this is queryAll method");
		return empDao.queryAll();
	}

	@Override
	public void delete(Emp emp) {
		empDao.delete(emp);
	}

	@Override
	public void insert(Emp emp) {
		empDao.insert(emp);
	}

	@Override
	public void update(Emp emp) {
		empDao.update(emp);
	}

}
