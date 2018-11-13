package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public void register(User user) {
		userDao.save(user);
	}

	@Override
	@Transactional(readOnly=true)
	public User login(User user) {
		return userDao.queryUser(user);
	}

}
