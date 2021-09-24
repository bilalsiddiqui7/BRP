package PracticeProblems;

public class PalindromeWords {
	public static void main(String[] args) {
			String s="bob";
			String rev="";
			for (int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			boolean palindrome=true;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=rev.charAt(i))
					palindrome=false;
			}
			if(palindrome)
				System.out.println("Word is Palindrome");
			else
				System.out.println("Word is Not Palindrome");
	}
}
