package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepo;
@Service
public class AdminDao {
	@Autowired
	AdminRepo ad_repo;
	// insert admin
	public Admin insert(Admin a) {
		return ad_repo.save(a);
	}
	
	public int getId(String username) {
		return ad_repo.getId(username);
	}
	
	public String getPassword(String username) {
		return ad_repo.getPassword(username);
	}
	// insert list admin
	public List<Admin> insertall(List<Admin> ad){
		return ad_repo.saveAll(ad);
	}
//delete admin
	public void deletebyid(int id) {
		ad_repo.deleteById(id);
		}
	//update password
	public Admin updatePass(Admin a) {
		Admin aa=ad_repo.findById(a.getAd_id()).orElse(null);
		aa.setUsername(a.getUsername());
		aa.setPassword(a.getPassword());
		return ad_repo.save(aa);
	}
	
}
