package com.designpatterns.strategy;
public class Football extends Sport {
	public Football(){
		setSportName("Football");		
		defensivePlay = new FootballDefense();
		offensivePlay = new FootballOffense();
	}
}
