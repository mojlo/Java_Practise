package com.inheritance;

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B b=new B();
		b.num1=5;
		b.num2=6;
		
		b.add();
		System.out.println(b.result);
		b.sub();
		System.out.println(b.result);
	}
}

	
	 class A{
		
		int num1,num2,result;
		
		
		
		public void add() {
			
			result=num1+num2;
		}
	}
	
 	class B extends  A{
		
		public void sub() {
			
			result=num1-num2;
		}
		
		
	}

