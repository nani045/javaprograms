package patterns;
import java.util.Scanner;

public class pattern14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n value:");
	int n = sc.nextInt();
	int count;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("_ ");
		}
		for(int j=1;j<=n;j++) {
			System.out.print("& ");
		}
		System.out.println();
	}
}
}
