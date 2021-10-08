package models;

import java.time.LocalDateTime;

public class Meal {
	int Id;
	
	String name;
	
	String description;
	
	/**
	 * True if calories is negative
	 */
	boolean exercise;
	
	int calories;
	
	LocalDateTime date;

}
