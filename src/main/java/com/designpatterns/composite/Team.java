package com.designpatterns.composite;
public class Team extends TeamComponent {
	String teamName;
	String teamColors;
	
	public Team(String teamName, String teamColors){
		this.teamName = teamName;
		this.teamColors = teamColors;
	}
	
	public String getTeamName(){
		return teamName;
	}
	
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	
	public String getTeamColors(){
		return teamColors;
	}
	
	public void setTeamColors(String teamColors){
		this.teamColors = teamColors;
	}
	
	public void displayTeamInfo(){
		System.out.println(getTeamName() + " team colors are " + getTeamColors());
	}
}
