package com.revature.models;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Meal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int Id;
	
	@Column
	int userId;
	
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
	LocalDateTime date;

}
