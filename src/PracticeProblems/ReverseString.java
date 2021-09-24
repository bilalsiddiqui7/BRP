package PracticeProblems;

public class ReverseString {
	public static void main(String[] args) {
		String s="Hello";
		String e="";
		for(int i=s.length()-1;i>=0;i--) {
			e=e+s.charAt(i);
		}
		System.out.println(e);
	}
}
