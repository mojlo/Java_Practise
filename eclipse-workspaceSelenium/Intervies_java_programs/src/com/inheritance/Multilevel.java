package com.inheritance;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D1 b=new D1();
		b.num1=5;
		b.num2=6;
		
		b.add();
		System.out.println(b.result);
		b.sub();
		System.out.println(b.result);
		b.div();
		System.out.println(b.result);
		b.multi();
		System.out.println(b.result);
	}
}

	
	 class A1{
		
		int num1,num2,result;
		
		
		
		public void add() {
			
			result=num1+num2;
		}
	}
	
 	class B1 extends  A1{
		
		public void sub() {
			
			result=num1-num2;
		}
		
		
	}
 	class C1 extends B1{
 		
 		public void div() {
 			
 			result=num1/num2;
 		}
 	}
class D1 extends C1{
	
	public void multi() {
		
		result=num1*num2;
	}
	
	
}