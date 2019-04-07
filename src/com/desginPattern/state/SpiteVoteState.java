package com.desginPattern.state;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		
		//恶意刷票，取消用户投票资格
		String str = voteManager.getMapVote().get(user);
		
		if(str != null) {
			voteManager.getMapVote().remove(user);
		}
		
		System.out.println("你有恶意刷屏行为，取消投票资格");
		
	}

}
