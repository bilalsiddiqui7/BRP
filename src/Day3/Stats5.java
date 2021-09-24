package Day3;

import java.util.Arrays;

public class Stats5 {
	public static void main(String[] args) {
		int min=0;
		int max=1;
		double avg=0;
		double[] arr= new double[5];
		for(int i=0;i<5;i++) {
			arr[i]=arr[i]+((Math.random()*(max-min)+min));
			avg=avg+arr[i];
		}
		double minm=arr[0];
		for(int i=0;i<5;i++) {
			minm=Math.min(minm,arr[i]);
		}
		System.out.println("The minimum value is "+minm);
		double maxm=arr[0];
		for(int i=0;i<5;i++) {
			minm=Math.max(maxm,arr[i]);
		}
		System.out.println("The maximum value is "+maxm);
		System.out.println("The average value is "+avg/5);
		System.out.println("Hello");
		
	}
}
