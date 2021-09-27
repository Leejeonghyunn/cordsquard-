import java.util.Scanner;
public class Gugudan6 {

	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요(ex. 4,5-쉼표필수) :");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
	
		
		for(int i= 2; i<=first; i++) {
			System.out.println(i+"단");
		    for(int j = 1; j<=second; j++) {
		    	System.out.println(i+"*"+j+"="+i*j);
		}
	     System.out.println("");
		}
		

	}

}
