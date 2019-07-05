package com.designpatterns.strategy;

public class RunApp {
	public static void main(String[] args){
		Sports baseball = new Baseball();
		Sports basketball = new Basketball();
		Sports football = new Football();
		
		System.out.println(baseball.getSportName() + " - " + baseball.makeDefensivePlay());
		System.out.println(basketball.getSportName() + " - " + basketball.makeDefensivePlay());
		System.out.println(football.getSportName() + " - " + football.makeDefensivePlay());
		System.out.println(baseball.getSportName() + " - " + baseball.makeOffensivePlay());
		System.out.println(basketball.getSportName() + " - " + basketball.makeOffensivePlay());
		System.out.println(football.getSportName() + " - " + football.makeOffensivePlay());
	}
}
