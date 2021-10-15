package com.revature.models;

import java.util.ArrayList;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int Id;
	
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
	ArrayList<User> friends;
}
