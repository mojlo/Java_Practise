import java.util.HashMap;
import java.util.Map;

public class Namemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> m=new HashMap<>();
		
		m.put(1,"neeraj");
		m.put(1,"rupesh");
		m.put(3,"neeraj");
		m.put(4,"london");
		m.put(2,"neelu");
		m.put(1,"bittu");
		
		for(Map.Entry m1:m.entrySet()){  
			   System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
