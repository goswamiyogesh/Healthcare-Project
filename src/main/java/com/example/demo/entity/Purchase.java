package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Purchase {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String Medicinename;
	private String Medicinepr;
}
