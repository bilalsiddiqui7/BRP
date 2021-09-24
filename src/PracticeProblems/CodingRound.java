//Question-4
//Program to find out non repeating interger numbers from any integer array.
package PracticeProblems;

import java.util.Arrays;

public class CodingRound {
	public static void Nonrepeating(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=(sum^arr[i]);
		}
		sum=(sum & -sum);
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & sum)>0) {
				sum1=(sum1^arr[i]);
			}
			else {
				sum2=(sum2^arr[i]);
			}
		}
		System.out.println("non repeating interger numbers from any integer array is "+sum1);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,4,4,3,5,5};
		int n=arr.length;
		Nonrepeating(arr,n);
		
	}
}
