package Day7;

public class SelectionSortPresentation {
	public static void main(String[] args) {
		int[] arr= {7,5,3,1,9};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			int min=i;
			for(int j=i;j<len;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			for(int a : arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("Sorted array");
		System.out.println("------------");
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
