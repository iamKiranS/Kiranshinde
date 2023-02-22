package com.java.program.opps.abstraction;

interface P {
	void m1();
}

interface Q {
	abstract void m2();
}

abstract class R {
	abstract void m3();
}

class S extends R implements P, Q {
	@Override
	public void m1() {
		System.out.println("S.P.m1()");
	}

	@Override
	public void m2() {
		System.out.println("S.Q.m2()");
	}

	@Override
	void m3() {
		System.out.println("S.R.m3()");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		S s = new S();
		s.m1();
		s.m2();
		s.m3();

	}
}
