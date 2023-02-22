
package com.java.student.program.inheritance;
class Vehical{
	String vehicalColor="black";
	public String method1() {
		return "vehicals is run on petrol or dissel";
	}
}
class Car extends Vehical{
	String carColor="silver";
	public String method2() {
		return "car is run on dissel";
	}
}

public class Simple_Inheritance {

	public static void main(String[] args) {
		
	Car car = new Car();
	System.out.println("vehical color     >>   "+car.vehicalColor);
	System.out.println(car.method1());
	System.out.println("car color         >>   "+car.carColor);
	System.out.println(car.method2());
	}
}
