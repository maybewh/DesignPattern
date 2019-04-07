package com.desginPattern.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	 
	private VoteState voteState;
	
	//记录用户投票的结果，Map<String,String>对应Map<用户名称,投票的选项>
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	//记录用户投票的次数,Map<String,Integer>对应Map<用户名称,投票的次数>
	private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();
	
	
	/**
	 * 获取用户投票结果的Map
	 * @return
	 */
	public Map<String, String> getMapVote(){
		return mapVote;
	}
	
	
	public void vote(String user,String voteItem) {
		//1.为该用户增加投票次数
		//从记录中取出该用户已有的投票次数
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount += 1;
		mapVoteCount.put(user,oldVoteCount);
		
		//2.判断该用户是否是正常投票
		if(oldVoteCount == 1) {
			voteState = new NormalVoteState();
		}else if(oldVoteCount > 1 && oldVoteCount < 5) {
			voteState = new RepeatVoteState();
		}else if(oldVoteCount >= 5 && oldVoteCount < 8) {
			voteState = new SpiteVoteState();
		}else if(oldVoteCount > 8){
			voteState = new BlackVoteState();
		}
		
		//然后转调状态对象来进行相应操作
		voteState.vote(user, voteItem, this);
	}
}
