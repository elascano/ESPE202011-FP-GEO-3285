import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer -->");
		int num = scanner.nextInt();
		if (num%2==0){
			System.out.println("The number entered is even -->" + num);
		}else{
		 System.out.println("The number entered is odd -->" + num);
		}
	}
}