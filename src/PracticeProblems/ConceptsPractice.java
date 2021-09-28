package PracticeProblems;

public class ConceptsPractice{
	public static void main(String[] args) {
		try {
			int[] arr=new int[5];
			arr[6]=10;
			int a=10;
			int b=0;
			int res=a/b;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Bye");
		}
	}
}
