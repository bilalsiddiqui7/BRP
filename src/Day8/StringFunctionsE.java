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

public class StringFunctionsE {
	public static void equalCheck(String s1,String s2) {
		System.out.println(s1.equals(s2));
	}
	public static void main(String[] args) throws Exception{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter first String : ");
		String s1=br.readLine();
		System.out.println("Enter second String : ");
		String s2=br.readLine();
		equalCheck(s1,s2);
	}
}
