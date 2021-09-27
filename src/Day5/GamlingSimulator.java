//Write a Program GamlingSimulator.java where a gambler starts with certain stake
//in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
//input. Keeps track of the number of times won and number of bets made. Run the
//simulation N times.
//Input - stake, goal and trails are taken as input
//Output - Number of times won, Percent Win and Avg number of bets made.
package Day5;

import java.util.Scanner;

public class GamlingSimulator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stake : ");
		int stake=sc.nextInt();
		System.out.println("Enter goal : ");
		int goal=sc.nextInt();
		int won=0;
		int bet=0;
		while(stake==goal || stake>0) {
			int n=(int)Math.floor(Math.random()*2);
			if(n==0) {
				stake--;
				bet++;
			}
			else {
				stake++;
				won++;
				bet++;
			}
		}
		System.out.println("Number of times won "+won);
		System.out.println("Avg number of bets made "+bet);
		System.out.println("Percent Win "+(won*100)/bet+"%");
	}
}
