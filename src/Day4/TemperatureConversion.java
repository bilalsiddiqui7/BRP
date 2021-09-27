//1. Write a TemperaturConversion.java program, given the temperature in fahrenheit
//as input outputs the temperature in Celsius or viceversa using the formula Celsius to
//Fahrenheit: (°C × 9/5) + 32 = °F
//Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
package Day4;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit : ");
		System.out.println("Enter the temperature in Celcius : ");
		double tempF=sc.nextDouble();
		double tempC=sc.nextDouble();
		double res1=(tempF - 32) * 5/9;
		double res2=(tempC * 9/5) + 32;
		System.out.println("the temperature "+tempF+" in Celcius = "+res1);
		System.out.println("the temperature "+tempC+" in Fahrenheit = "+res2);
	}
}
