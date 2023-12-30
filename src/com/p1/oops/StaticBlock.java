package com.p1.oops;

class Student11{
	static int a = 10;
	int b = 20;
	
	static{
		System.out.println("SB in A-class");
		System.out.println(a);
		System.out.println(new Student11().b);
	}
}

public class StaticBlock {
	public static void main(String args[]){
		Student11 b1 = new Student11();
		
	}
}


