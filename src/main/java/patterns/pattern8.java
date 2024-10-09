package patterns;
import java.util.Scanner;

public class pattern8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter then n value: ");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		int count=i;
		for(int j=1;j<=n;j++) {
			
			System.out.print(count);
			System.out.print("  ");
			count+= n;
		}
		System.out.println();
	}
}
}
