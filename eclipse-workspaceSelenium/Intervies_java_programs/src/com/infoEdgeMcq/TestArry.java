package com.infoEdgeMcq;

public class TestArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray= {1,2,3};
		try {
			
			int b=myIntArray[3];
			System.out.println(b);
		}catch(Exception e) {
			System.out.println(myIntArray[2]);
		}

	}

}
