package com.designpatterns.factory;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class RunApp {
	static HashMap<Integer, String> map = null;
	
	public static void main(String[] args){
		populateSports();
		displayOptions();
		SportsFactory sf = new SportsFactory();
		playSport(sf.sportsFactory(getUserInput()));
	}
		
	public static int getUserInput(){
		boolean repeat = true;
		Scanner kb = new Scanner(System.in);
		int theSport = 0;
		do{
			try{
				System.out.print("Which sport would you like to play: ");
				theSport = kb.nextInt();
				if(0 < theSport && theSport < 5)repeat = false;
			} catch(InputMismatchException e){
				kb.next();
			}
			if(repeat)System.out.println("Invalid Selection!! Please Enter 1, 2, 3, or 4");
		} while(repeat);
		kb.close();
		return theSport;
	}
	
	public static void displayOptions(){
		for(Entry<Integer, String> key: map.entrySet()){
			System.out.println(key.getKey() + " - " + key.getValue());
		}
	}
	
	public static HashMap<Integer, String> populateSports(){
		map = new HashMap<Integer, String>();
		map.put(1, "Baseball");
		map.put(2, "Basketball");
		map.put(3, "Football");
		map.put(4, "Exit");
		return map;
	}
	
	private static void playSport(Sport s){
		if(s == null){
			System.out.println("No sports for you! Goodbye!");
			return;
		}
		System.out.println("We're Playing - " + s.getSportName() + "!!!");
		System.out.println(s.makeOffensivePlay());
		System.out.println(s.makeDefensivePlay());
	}
}
