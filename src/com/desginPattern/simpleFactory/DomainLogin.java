package com.desginPattern.simpleFactory;

/**
 * ÓòµÇÂ¼
 * @author admin
 *
 */
public class DomainLogin implements Login{

	@Override
	public boolean verify(String username, String password) {
		
		//ÒµÎñÂß¼­
		return true;
	}

}
