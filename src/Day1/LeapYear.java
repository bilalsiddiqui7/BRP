package Day1;
import java.util.Scanner;
class Leap {
	static public void leapYr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year :");
		int year=sc.nextInt();
		if(year>=1582 && year%4==0 && year%100!=0 || year%400==0)
			System.out.println("Year is a Leap year");
		else
			System.out.println("Year is not a Leap year");
	}
}
public class LeapYear extends Leap{
	public static void main(String[] args) {
		leapYr();
	}
}
