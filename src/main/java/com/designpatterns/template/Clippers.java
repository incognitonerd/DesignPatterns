package com.designpatterns.template;
public class Clippers extends SuperNbaTeam {

	boolean teamWantsCenter(){
		return false;
	}
	
	boolean teamWantsPF(){
		return false;
	}
	
	boolean teamWantsPG(){
		return false;
	}
	
	@Override
	void addCenter(){
	}

	@Override
	void addPF(){
	}

	@Override
	void addSF(){;
		System.out.println("The Klaw");
	}

	@Override
	void addSG(){
		System.out.println("Paul George");
	}

	@Override
	void addPG(){	
	}
	
	@Override
	void displayTeamName(){
		System.out.println("Clippers");
	}
}
