package com.desginPattern.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	 
	private VoteState voteState;
	
	//��¼�û�ͶƱ�Ľ����Map<String,String>��ӦMap<�û�����,ͶƱ��ѡ��>
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	//��¼�û�ͶƱ�Ĵ���,Map<String,Integer>��ӦMap<�û�����,ͶƱ�Ĵ���>
	private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();
	
	
	/**
	 * ��ȡ�û�ͶƱ�����Map
	 * @return
	 */
	public Map<String, String> getMapVote(){
		return mapVote;
	}
	
	
	public void vote(String user,String voteItem) {
		//1.Ϊ���û�����ͶƱ����
		//�Ӽ�¼��ȡ�����û����е�ͶƱ����
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount += 1;
		mapVoteCount.put(user,oldVoteCount);
		
		//2.�жϸ��û��Ƿ�������ͶƱ
		if(oldVoteCount == 1) {
			voteState = new NormalVoteState();
		}else if(oldVoteCount > 1 && oldVoteCount < 5) {
			voteState = new RepeatVoteState();
		}else if(oldVoteCount >= 5 && oldVoteCount < 8) {
			voteState = new SpiteVoteState();
		}else if(oldVoteCount > 8){
			voteState = new BlackVoteState();
		}
		
		//Ȼ��ת��״̬������������Ӧ����
		voteState.vote(user, voteItem, this);
	}
}
