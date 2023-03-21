package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int m_id;
 private String m_name;
 private String description;
 private String  category;
 private int price;
}
