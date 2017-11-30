package com.situ.traffic;

import java.util.Scanner;

public class VehicleTest extends Vehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入初始速度：");
		double nextInitalSpeed = input.nextDouble();
		System.out.println("请输入要加的速度");
		double nextSpeedUp= input.nextDouble();
		vehicle.setSpeed(nextInitalSpeed);
		double speedUpNum =vehicle.speedUP(nextSpeedUp);
		System.out.println("最终速度："+speedUpNum);
	}
}
