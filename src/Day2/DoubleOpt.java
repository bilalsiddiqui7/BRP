package Day2;
import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		double a=sc.nextDouble();
		System.out.println("Enter second number");
		double b=sc.nextDouble();
		System.out.println("Enter third number");
		double c=sc.nextDouble();
		System.out.println("a + b * c = "+a + b *c);
		System.out.println("a * b + c = "+a * b + c);
		System.out.println("c + a / b = "+c + a / b);
		System.out.println("a % b + c = "+a % b + c);
		
	}
}
