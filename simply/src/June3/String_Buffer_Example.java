package June3;

public class String_Buffer_Example {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to ");
		sb.append("prolim");
		System.out.println(sb);
		
		sb.delete(1, 7);
		System.out.println(sb);
		
		sb.charAt(9);
		System.out.println(sb);
		
		sb.replace(1, 5, "Phase1");
		System.out.println(sb);
	}
}


//Output -
//
//Welcome to prolim
//W to prolim
//W to prolim
//WPhase1prolim
