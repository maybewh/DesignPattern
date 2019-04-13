package com.desginPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CounterA implements InvocationHandler{
	
	private Object brand;
	
	public CounterA(Object brand) {
		this.brand = brand;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���ۿ�ʼ����̨�ǣ�" + this.getClass().getName());
		method.invoke(brand, args);
		System.out.println("���۽���");
		return null;
	}

}
