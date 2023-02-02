package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.pojo.User;

public class UserDAOImpl {
	Scanner sc = new Scanner(System.in);
	User addUsers[]=null;
	public void register() {
		System.out.println("How Many Users Do You Want to Register");
		int size=sc.nextInt();
		for(int i=0; i<size;++i) {
			System.out.println("Enter User Id");
			int id=sc.nextInt();
			addUsers=new User[size];
			String fname=sc.next();
			String lname=sc.next();
			String email=sc.next();
			String pass=sc.next();
			long mn=sc.nextLong();
			User user = new User(id,fname,lname,pass,email,mn);
			addUsers[i]=user;
			System.out.println("User Added SuccessFully");
			
		}
	}
	
	public boolean verifyEmailAndPassword(String email,String pass) {
		for(User user:addUsers) {
			if(user.getEmail().equals(email)&&user.getPassword().equals(pass)) {
				return true;
			}
		}
		return false;
	}
	
	public String forgotPassword(String email) {
		for(User user:addUsers) {
			if(user!=null)
			if(user.getEmail().equals(email)) {
				return user.getPassword();
			}
		}
		return null;
	}

}
