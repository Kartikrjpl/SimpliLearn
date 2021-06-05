package June5;

public class Thread_Example extends Thread {


	 public void run() {
		System.out.println("Thread status "+Thread.currentThread().getName()+" :"+Thread.currentThread().getState());
		System.out.println("Thread status "+Thread.currentThread().getName()+" :"+Thread.currentThread().isAlive());
		System.out.println("Thread status "+Thread.currentThread().getName()+" id is :"+Thread.currentThread().getId());
		
		
		
	}
	public static void main(String[] args) {
		Thread_Example t1 = new Thread_Example();
//		Thread t1 = new Thread(m1);
//		t1.start();
		t1.setName("thread 1");
		
		Thread_Example t2 = new Thread_Example();
//		Thread t2 = new Thread(m2);
//		t2.start();
		t2.setName("thread 2");
		
		Thread_Example t3 = new Thread_Example();
//		Thread t3 = new Thread(m3);
//		t3.start();
		t3.setName("thread 3");
		
		
		Thread_Example t4 = new Thread_Example();
//		Thread t4 = new Thread(m4);
//		t4.start();
		t4.setName("thread 4");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		
		t4.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
}

// Extends Thread ---- Thread_Example t1 = new Thread_Example();
// t2.start();