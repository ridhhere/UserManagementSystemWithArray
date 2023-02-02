package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDAOImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserDAOImpl daoImpl=new UserDAOImpl();
		System.out.println("-----------------------------------------------");
		System.out.println("-          1) CreateAccount                   -");
		System.out.println("-          2) SignIn                          -");
		System.out.println("-          3) Forgot Password                 -");
		System.out.println("-          4) Exit                            -");
		System.out.println("-----------------------------------------------");



	}

}
