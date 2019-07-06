package com.designpatterns.observer;
import java.util.ArrayList;
import java.util.List;

public class ScoreGrabber implements Country {
	private List<ScoreListener> scoreListenersList;
	private int womensScore;
	
	public ScoreGrabber(){
		scoreListenersList = new ArrayList<ScoreListener>();
	}
	
	@Override
	public void register(ScoreListener s){
		System.out.println("Adding Score Listener");
		scoreListenersList.add(s);
	}
	
	@Override
	public void unregister(ScoreListener s){
		int idx = scoreListenersList.indexOf(s);
		System.out.println("Score Listener " + (idx+1) + " Deleted");
		scoreListenersList.remove(idx);
	}
	
	@Override
	public void notifyScoreListener(){
		for(ScoreListener s: scoreListenersList) {
			s.update(womensScore);
		}
	}

	public List<ScoreListener> getScoreListenersList(){
		return scoreListenersList;
	}

	public void setScoreListenersList(List<ScoreListener> scoreListenersList){
		this.scoreListenersList = scoreListenersList;
	}

	public int getWomensScore(){
		return womensScore;
	}

	public void setWomensScore(int womenScore){
		this.womensScore = womenScore;
		notifyScoreListener();
	}
}
