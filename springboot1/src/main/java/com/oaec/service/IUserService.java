package com.oaec.service;

import java.util.List;
import java.util.Map;

public interface IUserService {
	
	List<Map<String, Object>> selectAllUsers();
	
	int insertUsers();
}
