import java.util.Scanner;
public class Gugudan2 {

	public static void main(String[] args) {
		System.out.println("구구단중 출력할 값은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.println(number*i);
		}
		

	}

}
