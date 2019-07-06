package com.designpatterns.builder;

public interface CardBuilder {
	public void buildAthlete();
	public void buildTeam();
	public void buildContract();
	public Card getCard();
}