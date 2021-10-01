//Given a 2d array 
//  
//  1, 5, 7
//  3, 7, 7
//  3, 6, 2		
//  
//return the sum of the maximum sum in the row.
//
//eg: row 1 has 3, 7, 7 sum of this row is 3 + 7 + 7 = 17 
//
//print output : 17 
package Day9;

public class ClassroomProblem2 {
	public static void main(String[] args) {
		int[][] arr= {
				{1, 5, 7},
			    {3, 7, 7},
			    {3, 6, 2}	
		};
		int l=arr.length;
		int row1=0;
		int row2=0;
		int row3=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(i==0)
					row1=row1+arr[i][j];
				else if(i==1)
					row2=row2+arr[i][j];
				else
					row3=row3+arr[i][j];
			}
		}
		if(row1>row2&&row1>row3) {
			System.out.println("maximum sum in the row1 "+row1);
		}
		else if(row2>row1&&row2>row3) {
			System.out.println("maximum sum in the row2 "+row2);
		}
		else {
			System.out.println("maximum sum in the row3 "+row3);
		}
	}
}
