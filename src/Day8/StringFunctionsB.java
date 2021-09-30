//Write StringFunctions.java and have following static functions
//a. to check if the given two strings are an Anagram and return boolean value. One
//string is an anagram of another if the second is simply a rearrangement of the
//first. For example, 'heart' and 'earth' are anagrams...
//b. to check if the given String is palindrome or not? and return boolean value.
//Palindrome are those String whose reverse is equal to original. Do not use String
//Functions.
//c. to return all permutation of a String using Iterative method
//d. to return all permutation of a String using Recursion method
//e. to check if the arrays returned by two string functions above are equal
package Day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringFunctionsB {
	public static void isPalindrome(String s1) {
//		char[] s1Arr=s1.toCharArray();
		String revs2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			revs2=revs2+s1.charAt(i);
		}
		boolean pal=true;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=revs2.charAt(i)) {
				pal=false;
			}
		}
		if(pal) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is Not palindrome");
		}
	}
	public static void main(String[] args) throws Exception {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter first String : ");
		String s1=br.readLine();
		isPalindrome(s1);
	}
}
