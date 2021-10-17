package com.revature.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
public class Meal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int id;
	
	@ManyToOne
	User user;
	
	@Column
	String name;
	
	@Column
	String description;
	
	/**
	 * True if calories is negative
	 */
	@Column
	boolean exercise;
	
	@Column
	int calories;
	
	@Column
	LocalDate date;

}