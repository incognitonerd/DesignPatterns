package com.designpatterns.strategy;

public abstract class Sports {
	private String sportName;
	public Offense offensivePlay;
	public Defense defensivePlay;
	
	public String getSportName(){
		return sportName;
	}
	
	public void setSportName(String sportName){
		this.sportName = sportName;
	}
	
	public Offense getOffensivePlay(){
		return offensivePlay;
	}
	
	public void setOffensivePlay(Offense offensivePlay){
		this.offensivePlay = offensivePlay;
	}
	
	public Defense getDefensivePlay(){
		return defensivePlay;
	}
	
	public void setDefensivePlay(Defense defensivePlay){
		this.defensivePlay = defensivePlay;
	}
	
	public String makeDefensivePlay(){
		return defensivePlay.defensivePlay();
	}
	
	public String makeOffensivePlay(){
		return offensivePlay.offensivePlay();
	}
}
