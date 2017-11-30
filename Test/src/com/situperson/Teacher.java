package com.situperson;

public class Teacher extends AbstractPerson{

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(name + "是一名老师");
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	void Teacher(){
		System.out.println("Teacher.Teacher()");
	};
	
	
}
