//Write a program DayOfWeek.java that takes a date as input and prints the day of the
//week that date falls on. Your program should take three command-line arguments: m
//(month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth.
//For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the
//following formulas, for the Gregorian calendar (where / denotes integer division):

package Day3;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day : ");
		int d=sc.nextInt();
		System.out.println("Enter Month : ");
		int m=sc.nextInt();
		System.out.println("Enter Year : ");
		int y=sc.nextInt();
		
	}
	
}
