package com.staticc;

public class staticexa2 {
	
	static String company="HCL";
	
	int sapid;
	String employe;
	
	
	staticexa2(int id,String emp){
		
		sapid=id;
		employe=emp;
	}
	
	public void show() {
	System.out.println("my sap is is :"+sapid+"employe name is :  "+employe+" company name is :"+company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticexa2 s=new staticexa2(51775940, "neeraj");
		staticexa2 s1=new staticexa2(51775941, "neha");
		s.show();
		s1.show();

	}

}
