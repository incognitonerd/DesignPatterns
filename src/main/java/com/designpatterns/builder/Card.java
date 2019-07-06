package com.designpatterns.builder;
public class Card implements CardPlan {
	private Athlete athlete;
	private Team team;
	private Contract contract;
	
	@Override
	public void setAthlete(Athlete a){
		athlete = a;
	}
	
	public Athlete getAthlete(){
		return athlete;
	}
	
	@Override
	public void setTeam(Team t){
		team = t;
	}
	
	public Team getTeam(){
		return team;
	}
	
	@Override
	public void setContract(Contract c){
		contract = c;
	}
	
	public Contract getContract(){
		return contract;
	}
}
