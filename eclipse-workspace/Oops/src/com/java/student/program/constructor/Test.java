package com.java.student.program.constructor;

public class Test {
		
    int id;
	String name;
	String city;
	                                      
	public Test(int id,String city) {    //parameterized custructor
		                                 //catch the parameters
		this.id=id;                      //this is used to refer to the objects
		this.city=city;
		
		System.out.println(id+"  "+city);
	}
        public Test(int id,String name,String city) {     //we use here constructor overloading 
		
		this.id=id;
		this.name=name; 
		this.city=city;
		
		System.out.println(id+"  "+name+"   "+city);
	}
        public void method(int id,String name,String city) {
    		
   		this.id=id;
    	this.name=name;
   		this.city=city;
    		
    		System.out.println(id+"  "+name+"   "+city);
    	}

	public static void main(String[] args) {

		Test t1 = new Test(11,   "baramati");         //constructor get called at time of the creation of object
		Test t2 = new Test(13,   "Ajay",   "pune");   //argument passed
		Test t3 = new Test(17,  "Vijay",   "mumbai");
		
	}

}
