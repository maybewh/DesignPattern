package com.desginPattern.staticProxy;

public class CinemaProxyMoviePlay implements Movie{
	
	RealMovie movie;
	
	public CinemaProxyMoviePlay(RealMovie movie) {
		this.movie = movie;
	}
	
	/**
	 * 代理时，会有其他操作。如电影院也需要赚钱
	 */
	@Override
	public void play() {
		
		playAd(true);
		movie.play();
		playAd(false);
	}

	private void playAd(boolean b) {
		if ( b ) {
			System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
		} else {
			System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
		}
	}
	
}
