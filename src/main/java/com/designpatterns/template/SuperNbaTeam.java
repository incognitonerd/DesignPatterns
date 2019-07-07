package com.designpatterns.template;
public abstract class SuperNbaTeam {
	
	
	final void makeSuperTeam(){
		displayTeamName();
		
		if(teamWantsCenter()){
			addCenter();
		}
		if(teamWantsPF()){
			addPF();
		}
		if(teamWantsSF()){
			addSF();
		}
		if(teamWantsSG()){
			addSG();
		}
		if(teamWantsPG()){
			addPG();
		}
	}
	
	abstract void displayTeamName();

	abstract void addCenter();
	
	boolean teamWantsCenter(){
		return true;
	}
	
	abstract void addPF();
	
	boolean teamWantsPF(){
		return true;
	}
	
	abstract void addSF();
	
	boolean teamWantsSF(){
		return true;
	}
	
	abstract void addSG();
	
	boolean teamWantsSG(){
		return true;
	}
	
	abstract void addPG();
	
	boolean teamWantsPG(){
		return true;
	}
}
