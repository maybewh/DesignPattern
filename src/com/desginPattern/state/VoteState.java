package com.desginPattern.state;

public interface VoteState {
	
	/**
	 * ����״̬��Ӧ����Ϊ
	 * @param user ͶƱ��
	 * @param voteItem ͶƱ��
	 * @param voteManager 
	 *  ͶƱ�����ģ�����ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ�򣬿��Իص�����������
	 */
	public void vote(String user,String voteItem,
			VoteManager voteManager);
}
