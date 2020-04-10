package com.Interfacee;

public class PNB implements Bank{
	public float rateOfInterest(){return 9.7f;}

}

		class TestInterface2{  
		public static void main(String[] args){  
		Bank b=new SBI();  
		System.out.println("ROI: "+b.rateOfInterest());  
		}}  
