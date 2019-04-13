package com.desginPattern.simpleFactory;

/**
 * 根据调用者不同的要求，创建出不同的登录对象并返回
 * @author admin
 *
 */
public class LoginFactory {
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public static Login factory(String type) {
		
		if(type.equals("password")) {
			return new PasswordLogin();
		}else if(type.equals("passcode")) {
			return new DomainLogin();
		}else {
			throw new IllegalArgumentException("没有该种登录类型");
		}
	}
}
