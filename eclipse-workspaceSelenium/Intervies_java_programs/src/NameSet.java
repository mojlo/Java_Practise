import java.util.HashSet;
import java.util.Set;

public class NameSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s=new HashSet<>();
		
		s.add("neeraj");
		s.add("neeraj");

		s.add("lupesh");

		s.add("london");

		s.add("neeraj");

		for( String a:s) {
			
			System.out.println(a);
		}
		
		
	}

}
