package June3;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t= "Delhi";  
		String o = "Mumbai"; 
		String k= "delhi";  
		String y= new String ("Mumbai");   
		String l= new String ("delhi");   
		String p = new String("Hello");
		String b = "delhi";
		
		if(b==k) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	//             .equals   ==
//	(1) o with l -- false  false
//	(2) y with p -- false  false
//	(3) t with o -- false  false
//	(4) k with y -- false  false
//	(5) p with y -- false  false
	// (6) b with k -- true true
	// 3 in heap and 4 in string pool

}
