package patterns;
import java.util.Scanner;

public class pattern13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n value:");
	int n =sc.nextInt();
	int count;
	for(int i =1;i<=n;i++) {
		count=i;
		for(int j=1;j<=i;j++) {
			System.out.print(count+" ");
			count+= n;
		}
		System.out.println();
	}
			
}
}
