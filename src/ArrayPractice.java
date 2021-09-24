//WAP to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
//
//Before:    0  0  1  0  3  0  5  0  6                                              
//After:     1  3  5  6  0  0  0  0  0
public class ArrayPractice {
	public static void arrayPushZero(int arr[],int l) {
		int count=0;
		for (int i=0;i<l;i++) {
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		while(count<l)
			arr[count++]=0;
	}
	public static void main(String[] args)
	{
		int[] arr= {0,0,1,0,3,0,5,0,6};
		int l=arr.length;
		arrayPushZero(arr,l);
		for (int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
