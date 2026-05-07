package ProgramList;

import java.util.Scanner;

public class IfElseProblem4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("Number is divisible by 5");
		}else {
			System.out.println("Number is not divisible by 5");
		}
	}
}
