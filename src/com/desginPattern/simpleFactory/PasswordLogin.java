package com.desginPattern.simpleFactory;

/**
 * 常规的密码登录方式
 * @author admin
 *
 */
public class PasswordLogin implements Login{

	@Override
	public boolean verify(String username, String password) {
		
		
		//业务逻辑
		
		return true;
	}

}
