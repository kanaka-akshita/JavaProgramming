package ProgramList;
import java.util.Scanner;
public class NestedIf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your weight: ");
		int weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your blood group: ");
		String bloodGroup = sc.nextLine();
		
		if(weight > 50) {
			if(bloodGroup.equals("O+")) {
				System.out.println("eligible to donate blood");
			}else {
				System.out.println("not eligible");
			}	
		} else {
			System.out.println("not eligible");
		}
		sc.close();
	}
}
