package edu.mu.wb.example.model;

import java.util.ArrayList;

public class UserRegistry {

	private ArrayList<User> users = new ArrayList<>(); 
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public ArrayList<User> getUsers(){
		return new ArrayList<>(users);
	}
}
