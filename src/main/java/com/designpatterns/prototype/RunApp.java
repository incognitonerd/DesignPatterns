package com.designpatterns.prototype;
public class RunApp {
	public static void main(String[] args){
		SportCloneFactory sportCloner = new SportCloneFactory();
		Golf tiger = new Golf();
		
		Golf tigerClone = (Golf) sportCloner.makeClone(tiger);
		
		System.out.println(tiger);
		System.out.println(tigerClone);
		
		System.out.println("Tiger hash - " + System.identityHashCode(tiger));
		System.out.println("TigerClone hash - " + System.identityHashCode(tigerClone));
	}
}
