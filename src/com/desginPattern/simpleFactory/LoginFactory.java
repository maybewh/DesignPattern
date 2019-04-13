package com.desginPattern.simpleFactory;

/**
 * ���ݵ����߲�ͬ��Ҫ�󣬴�������ͬ�ĵ�¼���󲢷���
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
			throw new IllegalArgumentException("û�и��ֵ�¼����");
		}
	}
}
