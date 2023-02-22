package com.java.student.program.polymorphism;

class Old_dog {
	void getAnimalDetail() {
		System.out.println("old dog");
	}
}

class Dog extends Old_dog {
	void getAnimalDetail() {
		System.out.println("dog");
	}
}

class Small_dog extends Old_dog {
	void getAnimalDetail() {
		System.out.println("small dog");
	}
}

public class Animal {

	public static void main(String[] args) {
		Old_dog od = new Old_dog();
		od.getAnimalDetail();

		Small_dog sd = new Small_dog();
		sd.getAnimalDetail();

		Dog d = new Dog();
		d.getAnimalDetail();
	}

}
