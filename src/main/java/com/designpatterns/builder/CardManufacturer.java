package com.designpatterns.builder;
public class CardManufacturer {
	private CardBuilder cardBuilder;
	
	public CardManufacturer(CardBuilder cardBuilder){
		this.cardBuilder = cardBuilder;
	}
	
	public Card getCard() {
		return this.cardBuilder.getCard();
	}
	
	public void makeCollectibleCard() {
		this.cardBuilder.buildAthlete();
		this.cardBuilder.buildTeam();
		this.cardBuilder.buildContract();
	}
}
