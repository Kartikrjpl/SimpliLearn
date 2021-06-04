package June4;

abstract class pen{
		abstract void write();
		abstract void refill();
}

class fountain extends pen {

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("write method in fountain");
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("refill method in fountain ");
	}
	
	void changeNib() {
		System.out.println("change nib in fountain");
	}
}
class monkey{
	void jump() {
		System.out.println("jump in monkey");
	}
	void bite() {
		System.out.println("bite in monkey");
	}
}
interface animal{
	void eat();
	void sleep();
}

class human extends monkey implements animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat in human");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep in human");
	}
	
}

public class Assignment4 {
	public static void main(String[] args) {
		pen f1 = new fountain();
		
		f1.refill();
		f1.write();
		
		fountain f2 = new fountain();
		f2.changeNib();
		
		monkey h1 = new human();
		h1.bite();
		
		animal a1 = new human();
		a1.eat();
		a1.sleep();
		
		human h2 = new human();
		h2.jump();
		h2.eat();
		h2.sleep();
	}
	

}
