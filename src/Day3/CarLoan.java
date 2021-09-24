package Day3;

import java.util.Scanner;

public class CarLoan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Loan : ");
		double P=sc.nextInt();
		System.out.println("Enter the Year : ");
		double Y=sc.nextInt();
		System.out.println("Enter the Percent Interest : ");
		double R=sc.nextInt();
		double r=R/(12*100);
		double n=12*Y;
		double payment=(P*r)/(1-Math.pow(1+r,-n));
		System.out.println("Payment : "+payment);
	}
}
