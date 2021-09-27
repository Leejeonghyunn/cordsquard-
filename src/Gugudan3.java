import java.util.Scanner;
public class Gugudan3 {

	public static void main(String[] args) {
		System.out.println("구구단중 출력할 값은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값: "+number);
		
		if(number<2) {
			System.out.println("값을 잘못 입력하셨습니");
		} else if(number>10) {
			System.out.println("값을 잘못 입력하셨습니");
		} else {
		        for(int i = 1; i<10; i++) {
			    System.out.println(number*i);
		}
		

	}

	}
}
