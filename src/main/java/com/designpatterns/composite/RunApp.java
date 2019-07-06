package com.designpatterns.composite;

public class RunApp {
	static String basketballDescription = "Basketball is a team sport in which two teams opposing one another on a rectangular court, compete with the primary objective of shooting a basketball through the defender's hoop while preventing the opposing team from shooting through their own hoop.";
	static String footballDescription = "American football evolved from the sports of soccer and rugby football.";
	static String baseballDescription = "A baseball game is played between two teams, each composed of nine players, that take turns playing offense (batting and baserunning) and defense (pitching and fielding)";
	
	public static void main(String[] args){
		TeamComponent baseballTeams = new TeamGroup("Baseball", baseballDescription);
		TeamComponent footballTeams = new TeamGroup("Football", footballDescription);
		TeamComponent basketballTeams = new TeamGroup("Basketball", basketballDescription);
		TeamComponent everySport = new TeamGroup("Sport List", "Every Sport Available");
		everySport.add(baseballTeams);
		everySport.add(footballTeams);
		everySport.add(basketballTeams);
		
		
		baseballTeams.add(new Team("Pirates", "Yellow"));
		baseballTeams.add(new Team("A's", "Green"));
		baseballTeams.add(new Team("Rockies", "Purple"));
		
		footballTeams.add(new Team("Bengals", "Orange"));
		footballTeams.add(new Team("Browns", "Brown"));
		footballTeams.add(new Team("Falcons", "Red"));
		
		basketballTeams.add(new Team("Mavericks", "Blue"));
		basketballTeams.add(new Team("Spurs", "Grey"));
		basketballTeams.add(new Team("76s", "White"));
		
		ESPN espn = new ESPN(everySport);
		espn.getTeamComponent();
	}
}
