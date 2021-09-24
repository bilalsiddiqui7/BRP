package Day2;
import java.util.Scanner;
// * / % + -
public class IntOpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		System.out.println("a + b * c = "+(a + (b *c)));
		System.out.println("a * b + c = "+a * b + c);
		System.out.println("c + a / b = "+c + a / b);
		System.out.println("a % b + c = "+a % b + c);
		
	}
}
