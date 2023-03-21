package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminDao;
@RestController
public class AdminRestController {
	@Autowired
	AdminDao ad_dao;
	
	@PostMapping("/insertadmin")
	public Admin insert(@RequestBody Admin a) {
		return ad_dao.insert(a);
	}
	
	@PostMapping("/insertalladmin")
	public List<Admin> insertall(@RequestBody List<Admin> ad){
		return ad_dao.insertall(ad);
	}
	
	@DeleteMapping("/deletebyid")
	public void deletebyid(int id) {
		ad_dao.deletebyid(id);
	}
}
