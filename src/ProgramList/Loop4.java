package ProgramList;

public class Loop4 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("All odd numbers between the range: ");
		for(int i=0;i<=10;i++) {
			if(i %2 !=0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("sum of odd numbers: "+ sum);
	}
}
