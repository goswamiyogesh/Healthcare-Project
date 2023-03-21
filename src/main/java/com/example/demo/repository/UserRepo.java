package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	@Query("select u.password from User u where u.name=?1")
	public String userPwd(String name);

//@Query("update User u set u.item_purchased=?1 where u.name=?2")
//public String setItemPurchase(String name,String uname);
	
	@Query("select u.name from User u where u.name=?1")
	public String findNameByname(String name);
}
