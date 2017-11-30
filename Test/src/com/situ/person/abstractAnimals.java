package com.situ.person;

public abstract class abstractAnimals {
	String name;
	int age;
	
	
	public abstractAnimals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstractAnimals(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
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
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animals [name=" + name + ", age=" + age + "]";
	}
	
	public abstract  void walk();
	public abstract  void eat();
}
