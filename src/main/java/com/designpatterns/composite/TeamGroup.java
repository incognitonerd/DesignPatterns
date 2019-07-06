package com.designpatterns.composite;
import java.util.ArrayList;
import java.util.List;

public class TeamGroup extends TeamComponent {
	List<TeamComponent> teamComponentList = new ArrayList<TeamComponent>();
	String groupName;
	String groupDescription;
	
	public TeamGroup(String groupName, String groupDescription){
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	
	public List<TeamComponent> getTeamComponentList(){
		return teamComponentList;
	}
	
	public void setTeamComponent(List<TeamComponent> teamComponentList){
		this.teamComponentList = teamComponentList;
	}
	
	public String getGroupName(){
		return groupName;
	}
	
	public void setGroupName(String groupName){
		this.groupName = groupName;
	}
	
	public String getGroupDescription(){
		return groupDescription;
	}
	
	public void setGroupDescription(String groupDescription){
		this.groupDescription = groupDescription;
	}
	
	public void add(TeamComponent teamComponent){
		teamComponentList.add(teamComponent);
	}
	
	public void delete(TeamComponent teamComponent){
		teamComponentList.remove(teamComponent);
	}
	
	public TeamComponent getTeamComponent(int index) {
		return teamComponentList.get(index);
	}
	
	public void displayTeamInfo() {
		System.out.println(getGroupName() + " - " + getGroupDescription() + "\n");
		for(TeamComponent tmp: teamComponentList) {
			tmp.displayTeamInfo();
		}
	}
}
