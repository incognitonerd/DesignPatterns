package com.designpatterns.factory;
public class SportsFactory {
	public  Sport sportsFactory(int theSport){
		if(theSport == 1){
			return new Baseball();
		} else if(theSport == 2){
			return new Basketball();
		} else if(theSport == 3){
			return new Football();
		} else{
			return null;
		}
	}
}
