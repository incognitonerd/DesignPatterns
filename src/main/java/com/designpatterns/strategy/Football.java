package com.designpatterns.strategy;
public class Football extends Sports {
	public Football(){
		setSportName("Football");		
		defensivePlay = new FootballDefense();
		offensivePlay = new FootballOffense();
	}
}
