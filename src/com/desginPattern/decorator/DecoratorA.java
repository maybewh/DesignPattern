package com.desginPattern.decorator;

public class DecoratorA extends Decorator {
	
	public DecoratorA(Componet componet) {
		super(componet);
	}
	
	public void operation() {
		super.operation();
		//ÒµÎñ´úÂë
		System.out.println("A move");
	}
}
