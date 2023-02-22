package com.java.program.serialization;

import java.io.Serializable;

public class Mobile implements Serializable {

	private String name;
	private int prize;

	public Mobile(String name, int prize) {
		this.name = name;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", prize=" + prize + "]";
	}

}
