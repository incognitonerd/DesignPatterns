package com.designpatterns.singleton;
public class RunApp {
	public static void main(String[] args){
		TeamSingleton team1 = TeamSingleton.getInstance();
		TeamSingleton team2 = TeamSingleton.getInstance();
		// RunApp team2 = new RunApp();
		
		if(team1.hashCode() == team2.hashCode()){
			if(team1.equals(team2))
				System.out.println("Equal!");
			else
				System.out.println("Not Equal!");
		} else{
			System.out.println("Not Equal!");
		}
	}
}
