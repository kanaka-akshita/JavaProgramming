package PatternProgram;

public class Step3Pat {

	public static void main(String[] args) {
		int n=5;
		System.out.println("----Right Triangle---");
		//j>=(n-i)+1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=(n-i)+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----Inverted Right Triangle---");
		//j<=i
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----Left Triangle---");
		//j<=i
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----Inverted Left Triangle---");
		//j<=i
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=(n-i)+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------Left+Right-Down Traingle-----");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j<=n+1 || j-i>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  "); 
				}
			}
			System.out.println();
		}
		System.out.println("------Left+Right-Upper Traingle-----");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i>=j || i+j>=n*2) {
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
