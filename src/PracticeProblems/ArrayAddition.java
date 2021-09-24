package PracticeProblems;
//1-D Array
//public class ArrayAddition {
//	public static void main(String[] args) {
//		int[] arr1= {1,2,3,4,5};
//		int[] arr2= {5,4,3,2,1};
//		int l=arr1.length;
//		int[] arrf= new int[l];
//		for(int i=0;i<l;i++) {
//			arrf[i]=arr1[i]+arr2[i];
//		}
//		for (int a:arrf)
//			System.out.println(a);
//	}
//}

//2-D Array
public class ArrayAddition {
	public static void main(String[] args) {
		int[][] arr1= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		int l=arr1.length;
		int[][] arrf=new int[l][l];
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				arrf[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int[] a:arrf) {
			for(int b:a) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
}
}