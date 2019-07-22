package models;

import java.util.ArrayList;
import java.util.List;

import domain.Groups;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import views.HederPaneView;

public class GroupButtonsDto {
	private HederPaneView hederPaneView;
	private ActionEvent buttonEvent;
	private EventHandler<ActionEvent> event;
	
	public GroupButtonsDto () {
		
	}
	
	public List<GroupButtons> getGroupButtons(List<Groups> groups){
		List<GroupButtons> groupBtnList =  new ArrayList<GroupButtons>();
		for(Groups group : groups) {
			GroupButtons groupButtons = new GroupButtons();
			groupButtons.setGroupId(group.getGroup_id());
			groupButtons.setGroupName(group.getGroupName());
			System.out.println(group.getGroupName());
			groupButtons.addEventHandler(ActionEvent.ACTION, event);	
			groupBtnList.add(groupButtons);
		}
		return groupBtnList;
		
	}
	
	
	public EventHandler<ActionEvent> getEvent() {
		return event;
	}
	
	
	public void setEvent(EventHandler<ActionEvent> event) {
		this.event = event;
	}
}
