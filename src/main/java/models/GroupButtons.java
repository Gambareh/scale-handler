package models;


import javafx.scene.control.Button;


public class GroupButtons extends Button{
	
	private int groupId;
	private String groupName;

	public GroupButtons () {
		setPrefSize(200, 100);
		
	}

	
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
		
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
		setText(groupName);
	}
	

}
