package main;

import java.util.Scanner;

import strategy.InitStrategy;

import bean.User;


public class Main {

	public static void main(String[] args) {
		String userName = null;
		String password = null;
		ValidateUser vdUser = new ValidateUser();	
		Scanner reader = new Scanner(System.in);
		userName = reader.next();
		password = reader.next();
		User user = vdUser.validate(userName, password);
		if (user.getUserType() == null) {
			System.out.println("Validated fail!");
			return;
		}
		
		InitStrategy initf = new InitStrategy();
		initf.Init(user.getUserType());		
	}
}
