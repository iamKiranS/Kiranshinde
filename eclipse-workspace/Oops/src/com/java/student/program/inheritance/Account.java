package com.java.student.program.inheritance;
//sigle inheritance
class Amount{                   //another class created
	
	float salary = 33500f;
}

public class Account extends Amount {         //inherited one class to another class  

    float Balance = 452589.34f;
    
    public static void main(String[] args) {
	 
    	Account acc = new Account();           //instance creaction
   
    	System.out.println("Total Account Balance         :      " +acc.Balance);
    	System.out.println("Total Monthly salary          :      " +acc.salary);
 
	}
}
