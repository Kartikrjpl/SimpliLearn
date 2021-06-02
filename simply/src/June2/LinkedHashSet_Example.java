package June2;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LinkedHashSet_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(3);
		lhs1.add(1);
		lhs1.add(0.223f);
		lhs1.add(1.22f);
		lhs1.add('A');
		lhs1.add('g');
		lhs1.add(true);
		lhs1.add(false);
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
		System.out.println("Enter numbers from 1 to 8 in any order ");
//		System.out.println("Please enter 2 integers ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		int s7 = sc.nextInt();
		int s8 = sc.nextInt();
		
		lhs2.add(s1);
		lhs2.add(s2);
		lhs2.add(s3);
		lhs2.add(s4);
		lhs2.add(s5);
		lhs2.add(s6);
		lhs2.add(s7);
		lhs2.add(s8);
		
		System.out.println("LHS 1 object has "+lhs1);
		System.out.println("LHS 2 object has "+lhs2);
		
		TreeSet t1 = new TreeSet();
		t1.add("Java");
		t1.add("Python");
		t1.add("R");
		t1.add("C++");
		t1.add("C");
		t1.add("Swift");
		
		System.out.println("Initial tree set is "+t1);
		
		t1.remove("Python");
		t1.remove("R");
		
		System.out.println("After removing 2 elements tree set is "+t1);
		
		t1.add("Pearl");
		t1.add("JS");
		t1.add("HTML");
		
		System.out.println("After adding 3 elements treeset is "+t1);
		
		System.out.println(t1.contains("Java"));
		
		System.out.println("Clearing all elements ");
		t1.clear();
		System.out.println("after cleaning tree set is "+t1);

		
		
		
//		System.out.println("Please enter 2 float ");
//		float s3 = sc.nextFloat();
//		float s4 = sc.nextFloat();
//		System.out.println("Please enter 2 char ");
//		String s5 = sc.next();
//		String s6 = sc.nextLine();
//		
//		System.out.println("Please enter 2 booleans ");
//		boolean s7 = sc.nextBoolean();
//		boolean s8 = sc.nextBoolean();

	}

}
