package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.entity.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer>{
		@Query("select m from Medicine m where m.m_name LIKE %?1%")
        public List<Medicine> findBykeyword(String keyword);
}