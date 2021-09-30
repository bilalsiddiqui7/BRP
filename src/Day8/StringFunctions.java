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
import java.util.Arrays;

public class StringFunctions {
	public static void anagrams(String s1,String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		System.out.println(c1);
		System.out.println(c2);
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		if(Arrays.equals(c1,c2)) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are Not Anagram");
		}
	}
	public static void main(String[] args) throws Exception {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter first String : ");
		String s1=br.readLine();
		System.out.println("Enter second String : ");
		String s2=br.readLine();
		anagrams(s1,s2);
	}
}
