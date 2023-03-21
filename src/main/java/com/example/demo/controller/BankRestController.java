package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.BankDetails;
import com.example.demo.service.BankDao;

@RestController
public class BankRestController {
	@Autowired
	 private BankDao bdao;
	@PostMapping("/insertbank")
	public List<BankDetails> insertbank(@RequestBody List<BankDetails> bd){
		 return bdao.insertAll(bd);
	}
	
}
