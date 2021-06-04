package June4;
import java.util.Scanner;

public class Exception_Example {

	static void check_sal(int sal) throws custom_exception{
		if(sal<0) {
			System.out.println("Salary can't be negative");
		}
		else if(sal<2000) {
			throw new custom_exception("you need to work hard");
		}
		else if(sal>2100 && sal<5000) {
			throw new custom_exception("your salary is somehow good");
			
		}
		else if(sal > 5100 && sal <9000) {
			throw new custom_exception("salary is very good");
		}
		
		
	}


	public static void main(String[] args) {
		System.out.println("Please add salary");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		try {
			check_sal(sal);
		}
		catch (Exception e){
			
			System.out.println(e.getMessage());
		}
	}

}

class custom_exception extends Exception {
	custom_exception(String message){
		super(message);
	}
}
