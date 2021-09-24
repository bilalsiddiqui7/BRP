package PracticeProblems;
class Prime{
	public void isPrime(int n) {
		boolean p=true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				p=false;
		}
		if(p)
			System.out.println("Number is Prime Number");
		else
			System.out.println("Number is Not a Prime Number");
	}
}
public class PrimeNum {
	public static void main(String[] args) {
		Prime obj=new Prime();
		obj.isPrime(11);
	}
}
