package June3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex_Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an email id ");
		String email = sc.nextLine();
		String regex = "[A-Za-z0-9_.+]+@[A-Za-z0-9_.+]+\\.com";
		Pattern p = Pattern.compile(regex);
		Matcher c = p.matcher(email);
		System.out.println(c.matches());
		
		
		System.out.println("Please enter a phone number");
		String phone = sc.nextLine();
		String regex1 = "[+]91[0-9]{10}";
		Pattern p1 = Pattern.compile(regex1);
		Matcher c1 = p1.matcher(phone);
		System.out.println(c.matches());
		
		System.out.println("Please enter a password");
		String pass = sc.nextLine();
		String regex2 = "[A-Z]+[a-zA-Z]*[0-9][a-zA-Z]*[0-9][a-zA-Z]*[0-9][a-zA-Z]";
		Pattern p2 = Pattern.compile(regex2);
		Matcher c2 = p2.matcher(pass);
		System.out.println(c.matches());
		
		
		
		
	}
}

//
//Question (Pattern Matching):
//(1) validate the given email id (that shoud have pattern with @ and .com    
//    (a)  firstname@prolim.com
//    (b)  viren@gmail.com
//    (c)  test123prepare@co.edu.com
//(2) validate the phone number with country code +91 pattern mathing
//(3) password that shoud have - first letter caps  / contain 3 digits / contains any number of alpahbets also 