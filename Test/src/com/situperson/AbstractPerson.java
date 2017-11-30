package com.situperson;

public abstract class AbstractPerson {
	String name;
	int age;

	public abstract void showInfo();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public AbstractPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public AbstractPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

}
