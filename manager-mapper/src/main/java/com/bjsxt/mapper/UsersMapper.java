package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Users;

public interface UsersMapper {
	int insertUser(Users users);
	List<Users> selectAll();
	int deleteUserById(int id);
}
