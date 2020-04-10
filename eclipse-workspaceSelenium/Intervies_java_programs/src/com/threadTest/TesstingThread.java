package com.threadTest;

public class TesstingThread {
	 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			Hi h = new Hi ();
			Hello he = new Hello();
			
			h.start();
			try{ Thread.sleep(10); } catch(Exception e) { }
			he.start();
		}

	}


