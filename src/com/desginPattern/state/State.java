package com.desginPattern.state;

public interface State {
	
	/**
	 * 对应状态的处理
	 * @param sampleParameter
	 */
	public void handle(String sampleParameter);

}
