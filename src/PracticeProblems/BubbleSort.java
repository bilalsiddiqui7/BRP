package PracticeProblems;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {400,300,500,200,100};
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
		for (int i:arr)
			System.out.print(" "+i);
	}
}
