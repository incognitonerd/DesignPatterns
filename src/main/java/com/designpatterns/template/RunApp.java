package com.designpatterns.template;
public class RunApp {
	public static void main(String[] args){
		SuperNbaTeam team1 = new Lakers();
		SuperNbaTeam team2 = new Clippers();
		
		team1.makeSuperTeam();
		System.out.println("\n");
		team2.makeSuperTeam();
	}
}
