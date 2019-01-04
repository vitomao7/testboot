package com.oaec.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	List<Map<String, Object>> selectAllUsers();
	
	@Insert("insert into users(username,userpwd,usertel) values(#{username},#{userpwd},#{usertel})")
	int insertUser(@Param("username")String username,@Param("userpwd")String userpwd,@Param("usertel")String usertel);
}
