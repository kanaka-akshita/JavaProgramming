package ProgramList;

import java.util.Scanner;

public class IfElseProblem5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter price: ");
		int price = scanner.nextInt();
		System.out.println("Enter size: ");
		char size = scanner.next().charAt(0);
		
		if(size == 'S' || size == 's' && price <= 1000) {
			System.out.println("eligible to buy");
		}else {
			System.out.println("not eligible to buy");
		}
	}
}
