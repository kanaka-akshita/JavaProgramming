package PatternProgram;

public class Step1Pat {
	public static void main(String[] args) {
		int n=4;
		System.out.println("----L-shape-----");
		//i==n||j==1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("----Oppo. L-shape-----");
		//i==n || j==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----Inverted. L-shape-----");
		//i==1 || j==1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----oppo.Inverted. L-shape-----");
		//i==1 || j==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----C-shape-----");
		//i==1||i==n||j==1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---- oppo. C-shape-----");
		// i==1 || i==n || j==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1|| i==n || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----U-shape-----");
		//j==1||j==n||i==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n ||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----inverted-U-shape-----");
		//i==1||j==1||j==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----Equal-----");
		//i==1||i==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----Parellel-----");
		//j==1 || j==n 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----Box-----");
		//i==1||i==n||j==1||j==n
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
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