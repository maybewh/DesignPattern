package com.desginPattern.decorator;

public class Decorator implements Componet{
	
	private Componet componet;
	
	
	public Decorator(Componet componet) {
		this.componet = componet;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		componet.operation();
	}

}
