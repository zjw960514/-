package com.situ.fly;

public  class Dayan extends AbstractBrid implements IFly {
	

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(name + "\t" + "飞飞飞" );
	}

	protected void nanfei() {
		// TODO Auto-generated method stub
		System.out.println(name + "\t" + "南飞啊" );
	}

	public Dayan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dayan(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void egg() {
		// TODO Auto-generated method stub
		System.out.println(name  + "\t" + "下单");
	}
}
