package Day2;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x :");
		int x=sc.nextInt();
		System.out.println("Enter the value of y :");
		int y=sc.nextInt();
		int res=(int)Math.pow(x,x)+(int)Math.pow(y,y);
		int finalres=(int)Math.sqrt(res);
		System.out.println("the Euclidean distance from the point (x, y) to the origin (0, 0) is "+finalres);
	}
}
