package com.desginPattern.state;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ظ�ͶƱ
		System.out.println("�����ظ�ͶƱ");
	}

}
