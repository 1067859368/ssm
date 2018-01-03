package com.ssm.mapper;

import java.util.List;

import com.ssm.model.User;

/**
 * 用户mapper接口
 * @author 斌
 *
 */
public interface UserMapper {
	
	void saveUser(User user);
	
	boolean updateUser(User user);
	
	boolean deleteUser(int id);
	
	User findUserById(int id);
	
	List<User> findAll();
	
}
