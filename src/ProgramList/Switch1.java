package ProgramList;
import java.util.Scanner;
public class Switch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.println("1: 2: 3: 4:  5:");
			System.out.println("Enter an Integer: ");
			int input = sc.nextInt();
			switch(input) {
			case 1: System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			case 5: System.out.println("Five");
			break;
			default: System.out.println("Invalid");
			}
		}
		
		
}
