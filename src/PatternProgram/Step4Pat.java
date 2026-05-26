package PatternProgram;

public class Step4Pat {
	public static void main(String[] args) {
		int n =5;
		System.out.println("----Pyramid Shape----");
		//n-i || 2*i-1
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(j>=n-i+1 && j<=n+i-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Down-Pyramid-----");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(j>=i && i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------left-Pyramid-----");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j && i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Right-Pyramid-----");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1 && i-j<=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
