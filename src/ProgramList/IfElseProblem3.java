package ProgramList;

import java.util.Scanner;

public class IfElseProblem3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
	}
}
