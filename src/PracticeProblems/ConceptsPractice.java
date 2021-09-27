package PracticeProblems;
public class ConceptsPractice {
	public static void add(int ... a) {
		int s=0;
		for(int n:a) {
			s=s+n;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		add(1,2,3,4,5,6,7,8,9,10);
		

	}
}
