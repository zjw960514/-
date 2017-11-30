package com.test;

public class Son extends Father{
	
	public static void main(String[] args) {
		Father father = new Father(55);  //father(int i )
		System.out.println(father.toString());
		father.show("你是谁？");
		father.print(1, 1);
	}	
}
