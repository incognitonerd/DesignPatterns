package com.designpatterns.strategy;
public class Baseball extends Sport {
	public Baseball(){
		setSportName("Baseball");
		setDefensivePlay(new BaseballDefense());
		setOffensivePlay(new BaseballOffense());
	}
}
