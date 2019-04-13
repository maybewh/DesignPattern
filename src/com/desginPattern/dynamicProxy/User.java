package com.desginPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class User {
	
	public static void main(String[] args) {
		
		MaotaiJiu maotai = new MaotaiJiu();
		
		InvocationHandler handler = new CounterA(maotai);
		
		SellWine proxyInstance = (SellWine)Proxy.newProxyInstance(maotai.getClass().getClassLoader(),
				MaotaiJiu.class.getInterfaces(), handler);
		
		proxyInstance.mainJiu();
	}
}
