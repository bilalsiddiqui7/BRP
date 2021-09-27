import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Integer> values=new ArrayList<Integer>();
		values.add(909);
		values.add(705);
		values.add(807);
		values.add(406);
		values.add(608);
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer i,Integer j)
			{
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(values);
		for(Integer i:values) {
			System.out.println(i);
		}
		
	}
}
