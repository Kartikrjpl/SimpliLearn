package June4;
interface Draw {
	int salary = 100; 
	void d();
	void s();
}
interface Shape {
	int salary = 200;
	void f();
}

abstract class random_c implements Draw{
	void d() {
		System.out.println("abaahahahjh");
	}
}
public class Interface_Example implements Shape, Draw {

	public void d() {
		System.out.println("in d");
	}

	public void s() {
		System.out.println("in s");
	}

	public void f() {

		System.out.println("in f");
	}
	public static void main(String[] args) {
		int salary = 1000;
		Draw s = new Interface_Example(); // s -- > variables of draw and methods of interface example
		System.out.println(s.salary);
		System.out.println(s.salary);
	}

}
