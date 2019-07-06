package com.designpatterns.builder;
public class Athlete {
	private String name = "Shaq";
	private String age = "45";
	private String position = "Center";
	private String number = "34";
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	
	public String getNumber(){
		return number;
	}
	
	public void setNumber(String number){
		this.number = number;
	}

	@Override
	public String toString(){
		return "Athlete [name=" + name + ", age=" + age + ", position=" + position + ", number=" + number + "]";
	}
}
