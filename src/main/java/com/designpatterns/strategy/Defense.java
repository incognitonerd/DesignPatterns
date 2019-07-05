package com.designpatterns.strategy;
public interface Defense {
	String defensivePlay();
}

class FootballDefense implements Defense {
	@Override
	public String defensivePlay(){
		return "Pick six!";
	}
}

class BaseballDefense implements Defense {
	@Override
	public String defensivePlay(){
		return "Strike! You're out of there!";
	}
}

class BasketballDefense implements Defense {
	@Override
	public String defensivePlay(){
		return "Steal the ball!";
	}
}
