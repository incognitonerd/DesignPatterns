package com.designpatterns.composite;
public abstract class TeamComponent {
	public void add(TeamComponent newTeamComponent){
		throw new UnsupportedOperationException();
	}
	
	public void delete(TeamComponent newTeamComponent){
		throw new UnsupportedOperationException();
	}
	
	public void getComponent(int index){
		throw new UnsupportedOperationException();
	}
	
	public void displayTeamInfo(){
	}
}
