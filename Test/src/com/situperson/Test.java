package com.situperson;

public class Test {
	public static void main(String[] args) {
		AbstractPerson studentXiaoming = new Student("张三", 12);  
		studentXiaoming.showInfo();//站在人类的角度来看问题。student 类型的studentXiaoming调
		//用自己重写AbstractPerson中的showInfo方法
		Student xiaohong  = (Student)studentXiaoming;
		xiaohong.study(); //站在学生的角度看问题。
		AbstractPerson teacherxiaogang = new SmokingTeacher("李老师", 111);
		teacherxiaogang.showInfo();
		
	}
}
