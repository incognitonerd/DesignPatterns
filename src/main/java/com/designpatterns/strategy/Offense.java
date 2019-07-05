package com.designpatterns.strategy;

public interface Offense {
	String offensivePlay();
}

class FootballOffense implements Offense{
	@Override
	public String offensivePlay(){
		return "80 yard pass!";
	}
}

class BaseballOffense implements Offense{
	@Override
	public String offensivePlay(){
		return "Stolen base!";
	}
}

class BasketballOffense implements Offense{
	@Override
	public String offensivePlay(){
		return "Dunk!";
	}
}
