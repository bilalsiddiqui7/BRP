package Day7;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {6,3,6,8,7,4};
		int l=arr.length;
		for(int i=0;i<l;i++) {
			int min=i;
			for(int j=i;j<l;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}
}

