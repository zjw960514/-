package com.situ.traffic;


public class Vehicle {
	double speed;
	double size;

	protected void Move() {
	}
	
	protected double speedUP(Double num1 ) {
		return speed + num1 ;
	}
	
	protected void speedDown() {
		
	}
	
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
}
