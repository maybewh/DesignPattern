package com.desginPattern.simpleFactory;

/**
 * ���¼
 * @author admin
 *
 */
public class DomainLogin implements Login{

	@Override
	public boolean verify(String username, String password) {
		
		//ҵ���߼�
		return true;
	}

}
