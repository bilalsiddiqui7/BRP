
public class APattern {
	public static void main(String[] args) {
		int firstpt=10;
		int secondpt=10;
		for (int row=1;row<=10;row++) {
			for (int col=1;col<=20;col++) {
				if(col==firstpt || col==secondpt || row==5 && col>firstpt && col<secondpt && col%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			firstpt--;
			secondpt++;
		}
	}
}
