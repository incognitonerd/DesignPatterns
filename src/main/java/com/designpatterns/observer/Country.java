package com.designpatterns.observer;

public interface Country {
	public void register(ScoreListener s);
	public void unregister(ScoreListener s);
	public void notifyScoreListener();
}