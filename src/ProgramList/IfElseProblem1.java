package ProgramList;

import java.util.Scanner;

public class IfElseProblem1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative Number");
		}
	}
}
