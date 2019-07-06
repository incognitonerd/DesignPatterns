package com.designpatterns.factory;
public class Football extends Sport {
	public Football(){
		setSportName("Football");		
		defensivePlay = new FootballDefense();
		offensivePlay = new FootballOffense();
	}
}
