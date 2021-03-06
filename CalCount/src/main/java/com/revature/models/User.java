package com.revature.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
  int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	String password;
	
	/**
	 * height in centimeters
	 */
	@Column
	int height;
	
	/**
	 * weight in kilograms
	 */
	@Column
	int weight;
	
	@Column
	ArrayList<Integer> friends;
}