//Write a program RollDie.java that generates the result of rolling a fair six-sided die (an
//integer between 1 and 6). Repeat the Die Roll n times and suggest which number
//between 1 and 6 fall maximum number of times.
package Day6;

public class RollDie {
	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		for(int i=1;i<=100;i++) {
			int n=(int)Math.floor(Math.random()*6)+1;
			if(n==1)
				num1++;
			else if(n==2)
				num2++;
			else if(n==3)
				num3++;
			else if(n==4)
				num4++;
			else if(n==5)
				num5++;
			else
				num6++;
		}
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6)
			System.out.println("1 appeared maximum number of times. ie. "+num1);
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5 && num2>num6)
			System.out.println("2 appeared maximum number of times. ie. "+num2);
		else if(num3>num1 && num3>num2 && num3>num4 && num3>num5 && num3>num6)
			System.out.println("3 appeared maximum number of times. ie. "+num3);
		else if(num4>num1 && num4>num2 && num4>num3 && num4>num5 && num4>num6)
			System.out.println("4 appeared maximum number of times. ie. "+num4);
		else if(num5>num1 && num5>num2 && num5>num3 && num5>num4 && num5>num6)
			System.out.println("5 appeared maximum number of times. ie. "+num5);
		else
			System.out.println("6 appeared maximum number of times. ie. "+num6);
		
	}
}
