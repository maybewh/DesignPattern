package com.desginPattern.state;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, 
			VoteManager voteManager) {
		//正常投票，记录到投票纪录中
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("恭喜投票成功");
	}

}
