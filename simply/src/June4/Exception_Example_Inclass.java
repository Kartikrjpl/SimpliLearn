package June4;

import java.util.Scanner;

public class Exception_Example_Inclass {

	static void check_age(int age) throws custom{
		if(age<18) {
			System.out.println("Not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
		
		
	}


	public static void main(String[] args) {
		System.out.println("Please enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			check_age(age);
		}
		catch (Exception e){
			
			System.out.println(e.getMessage());
		}
	}
}

class custom extends Exception {
	custom (String message){
		super(message);
	}
}