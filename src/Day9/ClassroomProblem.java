//Take an array, input as {8,2,4,1,10,6,12,2} now perform a binary search 
package Day9;

public class ClassroomProblem {
	public static void main(String[] args) {
		int[] arr={8,2,4,1,10,6,12,2};
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
			System.out.print(a+" ");
		System.out.println();
		int counter=-1;
		for(int i=0;i<l;i++) {
			counter++;
			if(arr[i]==4)
				break;
		}
		System.out.println("Index number of 4 is "+counter);
	}
}
