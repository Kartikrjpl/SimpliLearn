package package2_June1;

import package1_June1.ClassM;
import package1_June1.ClassN;
import package1_June1.ClassP;



public class ClassZ extends ClassM{
	
	public static void main(String[] args) {
		ClassM objm = new ClassM();
		ClassN objn = new ClassN();
		ClassP objp = new ClassP();
		ClassZ objz = new ClassZ();
		
		objm.displayVar();
		objm.display_default();// reasoning mentioned in classy.java
		
		objn.displayVar_pub();
		objn.display_default();
		objn.display_protected();
		
		objz.disp_prot();
		ClassX objx = new ClassX();
		System.out.println("default long of class X "+objx.l1);
		System.out.println("public character of class X "+objx.c);
		System.out.println("Protected float of class X "+objx.f1);
		
		
	}

	//If z is sublcass of m
	// what is difference between
	// m objm = new z()
	// and z objz = new z()
	
	
	
	
	

}
