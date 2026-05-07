package ProgramList;

import java.util.Scanner;

public class ElseIfLadder4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		System.out.println("Enter c: ");
		int c = scanner.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is largest");
		}else if (b>=a && b>=c) {
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest");
		}
	}
}
