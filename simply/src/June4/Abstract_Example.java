package June4;

abstract class MNC {
	MNC(){
		
	}
	abstract void MNC_fun1();
	abstract void MNC_fun2();
	public void MNC_fun3() {
		System.out.println("In Fun3 MNC ");
	}
}

abstract class Infosys extends MNC{
	public void MNC_fun1() {
		System.out.println("Inside Fun1 Infosys");
	}
}

class Hello extends Infosys{


	void MNC_fun2() {
		System.out.println("Fun2 Hello");
	}
	
	void Hello_fun4() {
		System.out.println("Fun4 Hello");
	}
	
}

public class Abstract_Example {
	public static void main(String[] args) {

		Infosys c = new Hello();
		c.MNC_fun1();
		c.MNC_fun2();
		c.MNC_fun3();
		Hello c1 = new Hello();
		c1.Hello_fun4();
//		c1.MNC_fun1();
//		c1.MNC_fun2();
//		c1.MNC_fun3();
//		
		
		
	}
	
}

//OUTPUT
//Inside Fun1 Infosys
//Fun2 Hello
//In Fun3 MNC 
//Fun4 Hello
