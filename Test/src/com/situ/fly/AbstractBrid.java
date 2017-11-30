package com.situ.fly;

public abstract class AbstractBrid {
	int age;
	String name;
	public AbstractBrid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbstractBrid(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public abstract void egg();

	
}
