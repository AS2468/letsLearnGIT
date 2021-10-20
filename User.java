package binarySerach;

import java.util.Comparator;

public class User implements Comparator<User>{
	

	private
	String name,email,username,password;
	
	public User(String name,String email,String username,String password) {
		this.name=name;
		this.email=email;
		this.password=password;
		this.username=username;
	}

	public User() {
		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * User class implements the Comparator and overrides the compare() method
	 */
	@Override
	public int compare(User o1,User o2) {
		
		return o1.name.compareTo(o2.name);
	}

	@Override
	public String toString() {
		System.out.printf("%-15s %-15s %-15s %s\n","Name","Email","Username","Password");
		return String.format("%-15s %-15s %-15s %s\n",name,email,username,password);
	}
	
	
}
