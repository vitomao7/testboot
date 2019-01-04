package com.oaec.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.oaec.mapper.UserMapper;
import com.oaec.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	
	
	@Cacheable("allusers")
	@Override
	public List<Map<String, Object>> selectAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("123456");
		return userMapper.selectAllUsers();
	}

	
	@CacheEvict("allusers")
	@Override
	public int insertUsers() {
		userMapper.insertUser("zhangsansan", "666", "888");
//		int num = 1/0;
//		userMapper.insertUser("zhangsansan", "666", "888");	//
		
		return 0;
	}

}
