package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Medicine;
import com.example.demo.repository.MedicineRepo;

@Service
public class MedicineDao {
@Autowired
	private MedicineRepo mrepo;


//insert medicine
public Medicine insert(Medicine a) {
	return mrepo.save(a);
}

//delete Medicine
public String delete(Medicine a) {
	mrepo.delete(a);
	return "Deleted";
}
	
	//list of medicine
	public List<Medicine> getall(){
		return mrepo.findAll();
	}
	
	//medicine update by name
	public Medicine updateByName(Medicine a) {
		Medicine aa=mrepo.findById(a.getM_id()).orElse(null);
		aa.setM_name(a.getM_name());
		aa.setDescription(a.getDescription());
		aa.setCategory(a.getCategory());
		aa.setPrice(a.getPrice());
	return	mrepo.save(aa);
		
	}
	
	public  List<Medicine> findBykeyword(String keyword){
		return mrepo.findBykeyword(keyword);
	}
}
