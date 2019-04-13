package com.desginPattern.staticProxy;

public class CinemaProxyMoviePlay implements Movie{
	
	RealMovie movie;
	
	public CinemaProxyMoviePlay(RealMovie movie) {
		this.movie = movie;
	}
	
	/**
	 * ����ʱ�������������������ӰԺҲ��Ҫ׬Ǯ
	 */
	@Override
	public void play() {
		
		playAd(true);
		movie.play();
		playAd(false);
	}

	private void playAd(boolean b) {
		if ( b ) {
			System.out.println("��Ӱ���Ͽ�ʼ�ˣ����׻������֡�������9.8�ۣ������򰡣�");
		} else {
			System.out.println("��Ӱ���Ͻ����ˣ����׻������֡�������9.8�ۣ���ؼҳ԰ɣ�");
		}
	}
	
}
