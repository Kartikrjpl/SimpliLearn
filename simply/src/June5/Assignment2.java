package June5;

public class Assignment2 {
	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		YourThread t1 = new YourThread();
		m1.start();
		t1.start();
	}
}
class Mythread extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Lerning Java");
		}
	}	
}
class YourThread extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("We are in Phase1");
		}
	}
}