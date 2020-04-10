
public class Encaps {

	
	
	private int i;
	
	public void setI(int j) {
	
	i=j;
	
	}
	public  int getI() {
		
		return i;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encaps a=new Encaps();
		a.setI(12);
		System.out.println(a.getI());
		
	}

}
