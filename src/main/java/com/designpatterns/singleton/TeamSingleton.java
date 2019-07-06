package com.designpatterns.singleton;

public class TeamSingleton {
	private static  TeamSingleton teamSingletonInstance = null;
	
	private TeamSingleton() {	
	}
	
	public static TeamSingleton getInstance() {
		if(teamSingletonInstance == null) {
			teamSingletonInstance = new TeamSingleton();
		}
		return teamSingletonInstance;
	}
}
