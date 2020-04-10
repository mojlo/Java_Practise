import java.util.ArrayList;
import java.util.List;

public class Namelist {
	public static void main(String args[]) {
	List<Integer> l=new ArrayList<>();
	System.out.println(l);
/*	
	l.add("neeraj");
	l.add("neha");
	l.add("neha");
	l.add("rupesh");
	l.add("anil");
	*/
	l.add(12);
	l.add(5);
	l.add(44);
	l.add(45);
	for(Integer s:l) {
		
		System.out.println(s);
	}

}
}
