package com.inheritance;

public class Multiple {

	void msg() {
		System.out.println("Hello");
	}
}
class Mul1  {
	void msg() {
		System.out.println("Welcome");
	}
}

  class C extends Multiple,B {//suppose if it were  

	public static void main(String args[]) {
		C obj = new C();
		obj.msg();// Now which msg() method would be invoked?
	}
  }
}


