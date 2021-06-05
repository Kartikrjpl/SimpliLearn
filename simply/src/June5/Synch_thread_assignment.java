package June5;

class Line {
	 synchronized public void getLine() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
		
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		}
	}
}

class Train extends Thread{
	Line l; // aggregation is used here
	Train(Line l){
		this.l = l;
		
	}
	public void run() {
		l.getLine();
	}
}
public class Synch_thread_assignment {
	public static void main(String[] args) {

		Line l1 = new Line();
		
		Train train1 = new Train(l1);
		Train train2 = new Train(l1);
		
		train1.start();
		train2.start();	
	}
	
}
//
//0
//1
//2
//0
//1
//2

