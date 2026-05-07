package ProgramList;

public class Loop2 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("even numbers: ");
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("sum of even numbers: "+ sum);
	}
}
