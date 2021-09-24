//code to search an element from a list using for loop
package PracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		int search=8;
		for(int i=0;i<5;i++) {
			if(myList.get(i)==search)
				System.out.println("Element found at index number "+i);
		}
	}
}
