//create an array with 5 values and delete the value at index number 2 without using inbuilt function.
package PracticeProblems;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=arr[2];
		int l=arr.length;
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
			if(arr[i]==d) {
				for(int j=i+1;j<l-1;j++) {
					System.out.println(arr[j]);
				}
				break;
			}
		}
	}
}
