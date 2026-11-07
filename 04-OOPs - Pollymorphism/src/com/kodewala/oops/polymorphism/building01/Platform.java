package com.kodewala.oops.polymorphism.building01;

public class Platform {
	public static void main(String[] args) {

		MediaPlayer p = new MediaPlayer();


		// User 1 Playing
		Music m = new Music();
		p.playMedia(m);

		// User 2 Playing
		LiveStream l = new LiveStream();
		p.playMedia(l);

		// User 3 Playing
		Video v = new Video();
		p.playMedia(v);
	}

}
