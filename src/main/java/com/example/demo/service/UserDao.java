package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserDao {
@Autowired
private UserRepo u_repo;

public User insert(User a) {
	return u_repo.save(a);
}

public String userPwd(String name) {
	return u_repo.userPwd(name);
}


public List<User> getall(){
	return u_repo.findAll();
}

public String FindtheName(String name) {
	return u_repo.findNameByname(name);
	
	
}
public String delete(User a) {
	u_repo.delete(a);
	return "deleted";
}
}
