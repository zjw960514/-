package com.situperson;

public class Student  extends AbstractPerson{

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(name + "是一个学生"+ "，今年" + age +"岁");
	}
	
	public void study(){
		System.out.println(name + "学习");
	};
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
}
