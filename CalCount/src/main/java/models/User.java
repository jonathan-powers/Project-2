package models;

import java.util.List;

public class User {
	int Id;
	
	String name;
	
	String email;
	
	String password;
	
	/**
	 * height in centimeters
	 */
	int height;
	
	/**
	 * weight in kilograms
	 */
	int weight;
	
	List<Integer> friends;
}
