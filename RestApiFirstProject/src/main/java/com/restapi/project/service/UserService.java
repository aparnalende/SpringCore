package com.restapi.project.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.project.model.User;

@Service("userService")
@Transactional
public interface UserService {
	User findById(long id);
	User findByName(String name);

	void saveUser(User user);

//	void updateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers(); 

	void deleteAllUsers();

	public boolean isUserExist(User user);
}
