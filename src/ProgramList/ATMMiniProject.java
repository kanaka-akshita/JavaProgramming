package ProgramList;
import java.util.Scanner;
public class ATMMiniProject {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String AccName= "Akay";
		long AccNum= 1234567890L;
		double AccBal= 10000;
		
		int choice;
		
		do {
			System.out.println("Welcome to Mini ATM POC");
			System.out.println("-----ATM Menu----");
			System.out.println("1. Acc Details");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Acc Details --->");
				System.out.println("AccHolder Name: "+ AccName);
				System.out.println("Account Number: "+ AccNum);
				System.out.println();
				break;
			case 2: 
				System.out.println("Deposit ---->");
				System.out.println("Enter the deposit amount: ");
				double deposit = sc.nextDouble();
				AccBal = AccBal + deposit;
				System.out.println("Amount deposited successfully");
				System.out.println("New Balance: "+ AccBal);
				break;
			case 3: 
				System.out.println("Withdraw ----->");
				System.out.println("Enter the amount to withdraw: ");
				double withdraw = sc.nextDouble();
				if(withdraw <= AccBal) {
					AccBal = AccBal - withdraw;
					System.out.println("Amount withdrawn successfully");
					System.out.println("New Balance: "+ AccBal);
				}else {
					System.out.println("Insufficient Balance");
				}
				break;
			case 4: 
				System.out.println("Available Balance: "+ AccBal);
				break;
			case 5:
				System.out.println("Thank you for using ATM POC");
				break;
			default: 
				System.out.println("Invalid choice");
			}
			
		} while (choice != 5);
		
		sc.close();
		
	}
}
