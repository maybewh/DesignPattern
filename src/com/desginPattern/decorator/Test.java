package com.desginPattern.decorator;

public class Test {
	
	public static void main(String[] args) {
		
		Componet componet = new ConcreteComponet();
		
		//first
		Componet aComponet = new DecoratorA(componet);
		aComponet.operation();
		
		System.out.println("------");
		
		Componet bComponet = new DecoratorB(aComponet);
		bComponet.operation();
	}
}
