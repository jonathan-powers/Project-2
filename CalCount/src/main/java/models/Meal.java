package com.revature.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

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
	LocalDateTime date;
}
