package com.desginPattern.decorator;

public class DecoratorA extends Decorator {
	
	public DecoratorA(Componet componet) {
		super(componet);
	}
	
	public void operation() {
		super.operation();
		//ҵ�����
		System.out.println("A move");
	}
}
