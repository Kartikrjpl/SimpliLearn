package June3;

public class array_example {
	public static void main(String[] args) {
		int[][] arr1 = { {5,4} , {7,8}};
		int[][] arr2 = {{10,20},{40,2}};
		int[][] c = new int[arr1.length][arr1[0].length];
		for (int i=0;i<arr1.length;i++) {
			for(int j = 0; j<arr1[0].length;j++) {
				c[i][j] = arr1[i][j]+arr2[i][j];
				System.out.println("Element at "+i+" "+ j+" is " +c[i][j]);
			}
		}
	}
}
// output - 
//Element at 0 0 is 15
//Element at 0 1 is 24
//Element at 1 0 is 47
//Element at 1 1 is 10