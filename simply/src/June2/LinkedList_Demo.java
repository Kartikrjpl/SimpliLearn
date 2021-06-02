package June2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jan");
		ll.add("Feb");
		ll.add("March");
		ll.add("April");
		
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("List size is "+ll.size());
		System.out.println("-------------");
		ll.add("September");
		ll.add("October");
		
		Iterator<String> itr2 = ll.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("List size is "+ll.size());
		System.out.println("-------------");
		
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"Aug");
		
		Iterator<String> itr3 = ll.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("List size is "+ll.size());
		System.out.println("-------------");
		
		ll.addLast("November");
		ll.addLast("December");
		
		Iterator<String> itr4 = ll.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("List size is "+ll.size());
		System.out.println("-------------");
		
		
		
	}
}