package BRPPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stud o) {
		return name.length()>o.name.length() ? 1:-1;
	}
}
public class ComparableDemo {
		public static void main(String[] args) {
			List<Stud> studs=new ArrayList<>();
			studs.add(new Stud(1,99,"BilalSid"));
			studs.add(new Stud(2,54,"AshutoshShukla"));
			studs.add(new Stud(3,65,"Harsh"));
			studs.add(new Stud(4,65,"Hitesh"));
			studs.add(new Stud(5,98,"Japjeet"));
			Collections.sort(studs);
			for(Stud s : studs)
				System.out.println(s);
			
			
		}
}
