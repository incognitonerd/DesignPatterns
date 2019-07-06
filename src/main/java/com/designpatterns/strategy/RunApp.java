package com.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class RunApp {
	public static void main(String[] args){
		List<Sport> sportsList = new ArrayList<Sport>();
		sportsList.add(new Baseball());
		sportsList.add(new Basketball());
		sportsList.add(new Football());
	
		System.out.println("Offense Draws the Crowd!");
		for(Sport s: sportsList) {
			System.out.println(s.getSportName() + " - " + s.makeOffensivePlay());
		}
		
		System.out.println("\nDefense Wins Championships!");
		for(Sport s: sportsList) {
			System.out.println(s.getSportName() + " - " + s.makeDefensivePlay());
		}		
	}
}
