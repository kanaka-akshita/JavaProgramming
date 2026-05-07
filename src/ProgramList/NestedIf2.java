package ProgramList;
import java.util.Scanner;
public class NestedIf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			if(num % 6 == 0) {
				System.out.println("the number is even and divisible by 6");
			}else {
				System.out.println("the number is even but not divisible by 6");
			}
		}else {
			if(num % 3 == 0) {
				System.out.println("the number is odd and divisible by 3");
			} else {
				System.out.println("the number is odd but not divisible by 3");
			}
		}
		sc.close();
	}
}
