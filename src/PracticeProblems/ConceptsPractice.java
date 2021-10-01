package PracticeProblems;

import java.util.*;

class ConceptsPractice{
	public static void main(String[] args) throws Exception{
		int[] arr= {6,8,4,9,7};
		int l=arr.length;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr)
			System.out.println(a);
	}
}