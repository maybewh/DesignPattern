package com.desginPattern.decorator;

public class DecoratorB extends Decorator {

	public DecoratorB(Componet componet) {
		super(componet);
	}
	
	public void operation() {
		super.operation();
		//ÒµÎñ´úÂë
		System.out.println("B move.");
	}
}
