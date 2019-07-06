package com.designpatterns.observer;
public class ScoreObserver implements ScoreListener {
	private int womensScore;
	private static int idTracker = 0;
	private int observerId;
	private Country scoreGrabber;
	
	public ScoreObserver(Country scoreGrabber){
		this.scoreGrabber = scoreGrabber;
		this.observerId =++idTracker;
		System.out.println("Round " +observerId);
		scoreGrabber.register(this);
	}
	
	@Override
	public void update(int womensScore){
		this.womensScore = womensScore;
		printScores();
	}

	private void printScores(){
		System.out.println("USA: "+womensScore);
		
	}

	public int getWomensScore(){
		return womensScore;
	}

	public void setWomensScore(int womensScore){
		this.womensScore = womensScore;
	}

	public static int getIdTracker(){
		return idTracker;
	}

	public static void setIdTracker(int idTracker){
		ScoreObserver.idTracker = idTracker;
	}

	public int getObserverId(){
		return observerId;
	}

	public void setObserverId(int observerId){
		this.observerId = observerId;
	}

	public Country getScoreGrabber(){
		return scoreGrabber;
	}

	public void setScoreGrabber(Country scoreGrabber){
		this.scoreGrabber = scoreGrabber;
	}
}
