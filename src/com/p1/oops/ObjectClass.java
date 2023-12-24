package com.p1.oops;

import com.p1.oops.*;;

class student{
	int sid = 25;
	String sname = "Prakhar";
	String scity = "Agra";
	
	int sid1 = 17;
	String sname1 = "Kriti";
	String scity1 = "Aligarh";
}

public class ObjectClass {

	public static void main(String[] args) {
		
				//Without Object S1
		//Drawback-It creates different memory location so TimeCcomplexity is increased
			 
				System.out.println(new student().sid );
				System.out.println(new student().sname);
				System.out.println(new student().scity);
				
				System.out.println("\n-----------------------");
				//With Object S1
				
				
				student s1 = new student();
				System.out.println(s1.sid1);
				System.out.println(s1.sname1);
				System.out.println(s1.scity1);

		

	}

}
