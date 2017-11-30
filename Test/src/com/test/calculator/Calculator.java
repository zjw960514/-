package com.test.calculator;

import java.util.Scanner;

public class Calculator extends Number {

	protected static void add() {
		Calculator inputnumbers = inputNumbers();
		int result = inputnumbers.getAddResult();
		System.out.println("您输入的两个数的和是：" + result);
	}
	
	protected static void sub(){
		Calculator inputnumbers = inputNumbers();
		int subResult = inputnumbers.getSubResult();
		System.out.println("您输入的两个数的差是：" + subResult);
	}
	
	protected static void multi(){
		Calculator inputnumbers = inputNumbers();
		int multiResult = inputnumbers.getMultiResult();
		System.out.println("您输入的差是：" + multiResult);
	}
	
	protected static void div(){
		Calculator inputnumbers = inputNumbers();
		int DivResult = inputnumbers.getDivResult();
		System.out.println("您输入的差是：" + DivResult);
	}
	private static Calculator inputNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要计算的第一个数");
		int inputFristNumber = input.nextInt();
		System.out.println("请输入需要计算的第二个数");
		int inputSecendNumber = input.nextInt();
		Calculator inputnumbers = new Calculator(inputFristNumber, inputSecendNumber);
		return inputnumbers;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stubScanner input = new
		// Scanner(System.in);

	}

	public Calculator(int number1, int number2) {
		super(number1, number2);
		// TODO Auto-generated constructor stub

	}

	@Override
	protected int getAddResult() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}
	
	@Override
	protected int getSubResult() {
		// TODO Auto-generated method stub
		return number1 - number2;
	}
	
	@Override
	protected int getMultiResult() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
	
	@Override
	protected int getDivResult() {
		// TODO Auto-generated method stub
		return number1 / number2;
	}

}
