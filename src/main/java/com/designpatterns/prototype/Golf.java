package com.designpatterns.prototype;

public class Golf implements Sport{

	public Golf() {
		System.out.println("Golfer Created!");
	}
	
	@Override
	public Sport makeCopy(){
		System.out.println("Cloning Golfer!");
		Golf golfObject = null;
		try{
			golfObject = (Golf)super.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return golfObject;
	}

	@Override
	public String toString(){
		return "Tiger Tiger Tiger Woods Yall!";
	}
}
