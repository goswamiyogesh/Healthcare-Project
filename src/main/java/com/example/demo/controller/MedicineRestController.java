package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Medicine;
import com.example.demo.service.MedicineDao;

@RestController
public class MedicineRestController {
   @Autowired
	private MedicineDao m_dao;
   
   
   @PostMapping("/insertmedicine")
	public Medicine insert(@RequestBody Medicine a) {
		return m_dao.insert(a);
	}
}
