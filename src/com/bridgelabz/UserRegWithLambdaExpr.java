package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface FirstExp{
	void methodForLambda();
}

//Refactored Code with lambda Exrpession

public class UserRegWithLambdaExpr {
	public static void main(String[] args) {
		
		Scanner enter =new Scanner(System.in);
		
		//UC1 validating first name
		System.out.println("Enter first name: ");
		FirstExp obj = () -> { boolean b = Pattern.matches("[A-Za-z]{3,}", enter.next()); System.out.println(b); };
		obj.methodForLambda();
				
				
		//UC2 validating last name
		System.out.println("Enter last name: ");
		FirstExp obj1 = () -> { boolean b = Pattern.matches("[A-Za-z]{3,}", enter.next()); System.out.println(b); };
		obj1.methodForLambda();
		
		//checking if entered email is valid or not
		System.out.println("Enter email id: ");
		FirstExp obj2 = () -> { boolean b = Pattern.matches("[A-Za-z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,3}", enter.next()); System.out.println(b); };
		obj2.methodForLambda();
		System.out.println();
		
		
		//checking if entered mobile number is valid or not
		System.out.println("Enter Mobile No.: ");
		FirstExp obj3 = () -> { boolean b=Pattern.matches("[1-9]{2}\s[0-9]{10}", enter.next()); System.out.println(b); };
		obj3.methodForLambda();
		System.out.println();
		
		//checking the entered password by user
		
		/*
		password should contain at least 8 characters
 		password should contain atleast 1 upper case
 		password should contain atleast 1 numeric number
 		password should contain 1 special character
		 */
		
		System.out.println("Enter Password: ");
		System.out.println();
		System.out.println("password should contain at least 8 characters\r\n"
				+ "password should contain atleast 1 upper case\r\n"
				+ "password should contain atleast 1 numeric number\r\n"
				+ "password should contain 1 special character");
		System.out.println();
		FirstExp obj4 = () -> { boolean b= Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$", enter.next()); System.out.println(b); };
		obj4.methodForLambda();
		System.out.println();

	
}

}
