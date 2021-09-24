package PracticeProblems;

public class PalindromeNo {
	public static void main(String[] args) {
		int n=12321;
		int nog=n;
		int rev=0;
		while (n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if (rev==nog)
			System.out.println("Number is Palindrome");
		else 
			System.out.println("Number is Not Palindrome");
	}
}
