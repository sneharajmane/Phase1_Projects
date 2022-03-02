package com.phase.project;

import java.util.Scanner;

public class EmailVerification {

	public static void main(String[] args) {
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0] = "ganeshamnp@gmail.com";
		emails[1] = "starperson1@gmail.com";
		emails[2] = "mahesh777@gmail.com";
		emails[3] = "sneharajmane96@gmail.com";
		emails[4] = "Akankshlake07@gmail.com";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email:");
		String userEmail = sc.next();
		for(String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("Welcome back"+userEmail);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid User");
		}

	}

}
