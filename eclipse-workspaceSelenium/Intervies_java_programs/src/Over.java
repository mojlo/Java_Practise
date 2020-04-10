
public class Over {  
		 public int add(int a,int b){return a+b;}  
		public  int add(int a,int b,int c){return a+b+c;}  
		}  
		class TestOverloading1{  
		public static void main(String[] args){  
			Over o=new Over();
		System.out.println(o.add(11,11));  
		System.out.println(o.add(11,11,11));  
	}}  

