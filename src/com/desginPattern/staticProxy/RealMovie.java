package com.desginPattern.staticProxy;

public class RealMovie implements Movie{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("您正在看的电影为：《哈哈》");
	}
	
}
