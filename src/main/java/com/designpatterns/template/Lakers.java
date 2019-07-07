package com.designpatterns.template;

public class Lakers extends SuperNbaTeam{
	
	@Override
	void addCenter(){
		System.out.println("The Big Diesel");
	}

	@Override
	void addPF(){
		System.out.println("The Slim Reaper");
	}

	@Override
	void addSF(){
		System.out.println("King James");
	}

	@Override
	void addSG(){
		System.out.println("The Black Mamba");
	}

	@Override
	void addPG(){
		System.out.println("Chef Curry");
	}

	@Override
	void displayTeamName(){
		System.out.println("Lakers");
	}
}
