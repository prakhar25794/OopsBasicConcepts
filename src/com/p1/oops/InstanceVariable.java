package com.p1.oops;

class student1{
	int sid;
	String sname;
	String scity;
	
}


public class InstanceVariable {

	public static void main(String[] args) {
		student s1 = new student();
		s1.sid=101;
		s1.sname = "Vivek";
		s1.scity = "Noida";
		
		student s2 = new student();
		s2.sid = 102;
		s2.sname = "Prakhar";
		s2.scity = "Aligarh";
	
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.scity);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s1.scity);
		
		
		
	}
	

}
