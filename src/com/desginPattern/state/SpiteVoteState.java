package com.desginPattern.state;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		
		//����ˢƱ��ȡ���û�ͶƱ�ʸ�
		String str = voteManager.getMapVote().get(user);
		
		if(str != null) {
			voteManager.getMapVote().remove(user);
		}
		
		System.out.println("���ж���ˢ����Ϊ��ȡ��ͶƱ�ʸ�");
		
	}

}
