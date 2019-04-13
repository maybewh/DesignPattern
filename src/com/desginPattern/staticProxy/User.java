package com.desginPattern.staticProxy;

public class User {
	
	public static void main(String[] args) {
		
		CinemaProxyMoviePlay cpp = new CinemaProxyMoviePlay(new RealMovie());
		cpp.play();
	}
}
