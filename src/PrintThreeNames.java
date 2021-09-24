import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name :");
		String name1=sc.nextLine();
		System.out.println("Enter Second name :");
		String name2=sc.nextLine();
		System.out.println("Enter Third name :");
		String name3=sc.nextLine();
		System.out.println("Hi "+name3+" ,"+name2+" ,"+name1);
	}
}
