
public class Gugudan4 {

	public static void main(String[] args) {
		 int[][] result = new int[10][10];
		 for(int j = 2; j<result.length; j++) {
		   for(int i = 1; i<result.length; i++) {
			   result[j][i] =  j*i;
		 System.out.println(result[j][i]);
		 }
		 
		 

	}
	}
}
