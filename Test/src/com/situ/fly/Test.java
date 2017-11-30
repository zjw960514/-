package com.situ.fly;

public class Test {
	public static void main(String[] args) {
		AbstractBrid abstractBrid = new Dayan(11,"我是鸟");
		abstractBrid.egg();
		Dayan dayan = (Dayan)abstractBrid;
		dayan.fly();
		dayan.nanfei();
	}
}