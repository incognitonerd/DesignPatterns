package com.designpatterns.strategy;
public class Baseball extends Sports {
	public Baseball(){
		setSportName("Baseball");
		setDefensivePlay(new BaseballDefense());
		setOffensivePlay(new BaseballOffense());
	}
}
