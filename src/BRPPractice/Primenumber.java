package BRPPractice;
import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the initial range");
	    int number1 = myObj.nextInt();
	    System.out.println("Enter the final range");
	    int number2 = myObj.nextInt();
		primeNum(number1,number2);
	}
	public static void primeNum(int num1,int num2) {
		for(int i=num1;i<num2;i++) {
			int temp=0;
			if (i==1)
				continue;
			for(int j=2;j<i;j++) {
				if (i%j==0)
					temp+=1;
			}
			if (temp==0)
				System.out.println(i);
		}
	}
}
