package com.p1.oops;

class A{
	static int a;
}

public class StaticVariable {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		a1.a = 100;
		a2.a = 400;
		System.out.println(a1.a);
		System.out.println(a2.a);

	}

}
