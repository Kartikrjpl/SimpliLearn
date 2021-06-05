package June5;

class Customer {
	int amount = 10000;
	synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Less balance");
		
		try {
			System.out.println("Waiting");
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		
		}
		}
	
		this.amount-=amount;
		System.out.println("Withdrawl completed --- > Balance is "+this.amount);
}
	synchronized void deposit(int amount) {
		System.out.println("Desposting");
		this.amount+=amount;
		System.out.println("Depositied --- > Balance is "+this.amount);
		notify();
	}
}

public class Notify_wait_Assignment {
	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(17000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(17000);
			}
		}.start();
		
		
		
	}
}
// OUTPUT
//Withdrawl completed --- > Balance is 8000
//Less balance
//Waiting
//Desposting
//Depositied --- > Balance is 25000
//Withdrawl completed --- > Balance is 8000
