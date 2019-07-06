package com.designpatterns.builder;
public class Contract {
	private String lengthOfContract = "4 years";
	private String salary = "200 Million";
	
	public String getLengthOfContract(){
		return lengthOfContract;
	}
	
	public void setLengthOfContract(String lengthOfContract){
		this.lengthOfContract = lengthOfContract;
	}
	
	public String getSalary(){
		return salary;
	}
	
	public void setSalary(String salary){
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "Contract [lengthOfContract=" + lengthOfContract + ", salary=" + salary + "]";
	}
}
