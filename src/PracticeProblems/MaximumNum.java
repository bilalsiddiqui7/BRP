//write a code to find the maximum value from an array without using inbuilt function
package PracticeProblems;

public class MaximumNum {
	public static void main(String[] args) {
		int[] arr= {500,300,100,400,200};
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
		System.out.println(arr[4]);
	}
}
