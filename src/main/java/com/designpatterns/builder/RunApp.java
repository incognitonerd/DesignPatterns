package com.designpatterns.builder;

public class RunApp {
	public static void main(String[] args){
		CardBuilder card = new CollectibleCardBuilder();
		CardManufacturer cardManufacturer = new CardManufacturer(card);
		cardManufacturer.makeCollectibleCard();
		Card firstCard = cardManufacturer.getCard();
		System.out.println("Collectible Card Builder");
		System.out.println("Card Athlete - "+firstCard.getAthlete());
		System.out.println("Card Team - " + firstCard.getTeam());
		System.out.println("Card Contract - " + firstCard.getContract());
	}
}
