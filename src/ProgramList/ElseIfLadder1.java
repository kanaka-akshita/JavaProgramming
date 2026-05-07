package ProgramList;

import java.util.Scanner;

public class ElseIfLadder1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter grade: ");
		char grade = scanner.next().charAt(0);
		
		if(grade == 'A'|| grade == 'a') {
			System.out.println("First Class");
		} else if(grade == 'B' || grade == 'b'){
			System.out.println("Second Class");
		} else if(grade == 'C'|| grade == 'c') {
			System.out.println("Third Class");
		} else {
			System.out.println("Student Fail");
		}
		
	}
}
