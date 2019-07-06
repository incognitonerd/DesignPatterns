package com.designpatterns.prototype;

public class SportCloneFactory {
	
	public Sport makeClone(Sport sportSample) {
		return sportSample.makeCopy();
	}
}
