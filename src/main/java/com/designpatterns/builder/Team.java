package com.designpatterns.builder;

public class Team {
	private String nameOfSport = "Basketball";
	private String nameOfTeam = "L.A. Lakers";
	
	public String getNameOfSport(){
		return nameOfSport;
	}
	
	public void setNameOfSport(String nameOfSport){
		this.nameOfSport = nameOfSport;
	}
	
	public String getNameOfTeam(){
		return nameOfTeam;
	}
	
	public void setNameOfTeam(String nameOfTeam){
		this.nameOfTeam = nameOfTeam;
	}

	@Override
	public String toString(){
		return "Team [nameOfSport=" + nameOfSport + ", nameOfTeam=" + nameOfTeam + "]";
	}
}
