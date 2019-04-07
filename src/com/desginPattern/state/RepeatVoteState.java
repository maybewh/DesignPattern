package com.desginPattern.state;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//重复投票
		System.out.println("请勿重复投票");
	}

}
