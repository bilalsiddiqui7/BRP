//Given an array with 10 integers containing 1 to 10 and among them one number is
//repeated twice. Write the Logic to find out the repeated number.
package Day6;

public class Array {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,6,8,9,10};
		int a=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[j+1])
					a=arr[j];
			}
		}
		System.out.println("the repeated number in the given array is "+a);
	}
}
