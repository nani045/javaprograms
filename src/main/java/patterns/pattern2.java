package patterns;
import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			System.out.print("# ");
		}
	}
}
