//Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
package PracticeProblems;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int nog=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if (sum==nog) {
			System.out.println("Number is Armstrong number");
		}
		else
			System.out.println("Number is Not Armstrong number");
	}
}
