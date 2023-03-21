package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
	@Query("select a.password from Admin a where a.username=?1")
	public String getPassword(String username);
	
	@Query("select a.ad_id from Admin a where a.username=?1")
	public int getId(String username);
}
