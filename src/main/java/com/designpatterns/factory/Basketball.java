package com.designpatterns.factory;

public class Basketball extends Sport{
	public Basketball() {
		setSportName("Basketball");
		defensivePlay = new BasketballDefense();
		offensivePlay = new BasketballOffense();
	}
}