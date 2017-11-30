package com.test.calculator;

public class Number {
	protected int number1;
	protected int number2;

	public Number(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected int getAddResult() {
		// TODO Auto-generated method stub
		System.out.println("Number.getResult()");
		return 0;
	}
	protected int getSubResult() {
		// TODO Auto-generated method stub
		System.out.println("Number.getResult()");
		return 0;
	}
	protected int getMultiResult() {
		// TODO Auto-generated method stub
		System.out.println("Number.getResult()");
		return 0;
	}
	protected int getDivResult() {
		// TODO Auto-generated method stub
		System.out.println("Number.getResult()");
		return 0;
	}

	/**
	 * @return the number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * @param number1
	 *            the number1 to set
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * @return the number2
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * @param number2
	 *            the number2 to set
	 */
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
