package patterns;
import java.util.Scanner;

public class pattern21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || j==1 || i==n || j==i) {
					System.out.print("# ");
				}
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
	}
}
