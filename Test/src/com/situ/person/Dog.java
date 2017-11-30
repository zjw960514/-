package com.situ.person;

public abstract class Dog extends abstractAnimals {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void Jiao(){
		System.out.println(name+"在叫");
	}
	
	public void tiao(){
		System.out.println(name+"在跳");
	}
}
