package com.designpatterns.composite;

public class ESPN {
	TeamComponent teamComponent;
	
	public ESPN(TeamComponent teamComponent) {
		this.teamComponent=teamComponent;
	}
	
	public void getTeamComponent() {
		teamComponent.displayTeamInfo();
	}
}
