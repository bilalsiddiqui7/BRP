//Write a program that takes a range of number as input and outputs the Prime
//Numbers in that range.
package Day6;

import java.util.Scanner;

public class PrimeNumber {
	public static void isPrime(int n1,int n2) {
		for(int i=n1;i<n2;i++) {
			boolean prime=true;
			for(int j=n1;j<i;j++) {
				if(i%j==0)
					prime=false;
			}
			if(prime)
				System.out.println(i);		
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter initial number : ");
		int ino=sc.nextInt();
		System.out.println("Enter final number : ");
		int fno=sc.nextInt();
		isPrime(ino,fno);
	}
}
