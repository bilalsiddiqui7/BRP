package PracticeProblems;

import java.util.*;

class ConceptsPractice{
	public static void main(String[] args) throws Exception{
		Map m=new HashMap();
		m.put(1,"Bilal");
		m.put(2,"Harsh");
		m.put(3,"Japjeet");
		m.put(4,"Sam");
		Set s=m.keySet();
		for(Object key : s) {
			System.out.println(m.get(key));
		}
	}
}