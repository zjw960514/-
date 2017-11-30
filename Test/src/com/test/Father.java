package com.test;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Father extends GrandFather {

	protected int age;

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(int age, String name, char gender) {
		super(age, name, gender);
		// TODO Auto-generated constructor stub
	}

	public Father(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Father [age=" + age + "]";
	}

	void show(int i) {
		System.out.println(i);
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Father.show()");
	}

	void show(String words) {
		System.out.println(words + "你从哪里来？");
	}

	void print(int i, int j) {
		for (int k = i; k <= 9; k++) {
			for (int l = j; l <= k; l++) {
				System.out.print(k + "*" + l + "=" + k * l + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.show();
		Father father = new Father();
		father.show(5);

	}

}
