package com.designpatterns.strategy;

public class Basketball extends Sports{
	public Basketball() {
		setSportName("Basketball");
		defensivePlay = new BasketballDefense();
		offensivePlay = new BasketballOffense();
	}
}