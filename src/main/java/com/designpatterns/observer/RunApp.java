package com.designpatterns.observer;
public class RunApp {
	public static void main(String[] args){
		ScoreGrabber usWomensFirstRound = new ScoreGrabber();
		ScoreObserver scoreObserver1 = new ScoreObserver(usWomensFirstRound);
		
		usWomensFirstRound.setWomensScore(3);
		usWomensFirstRound.setWomensScore(2);
		usWomensFirstRound.setWomensScore(4);
		
		ScoreGrabber usWomensSecondRound = new ScoreGrabber();
		ScoreObserver scoreObserver2 = new ScoreObserver(usWomensSecondRound);
		
		usWomensSecondRound.setWomensScore(2);
		usWomensSecondRound.setWomensScore(1);
		usWomensSecondRound.setWomensScore(0);
	}
}
