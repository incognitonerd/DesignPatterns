package com.designpatterns.builder;
public class CollectibleCardBuilder implements CardBuilder {
	private Card card;
	
	public CollectibleCardBuilder(){
		card = new Card();
	}
	
	@Override
	public void buildAthlete(){
		card.setAthlete(new Athlete());
	}
	
	@Override
	public void buildTeam(){
		card.setTeam(new Team());
	}
	
	@Override
	public void buildContract(){
		card.setContract(new Contract());
	}

	@Override
	public Card getCard(){
		return this.card;
	}
}
