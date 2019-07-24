package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import views.CenterPaneView;
import views.RightPaneView;

public class RightPaneController {
	private RightPaneView rightPaneView;
	private Rectangle2D primaryScreenBounds;
	
	public RightPaneController (RightPaneView rightPaneView,Rectangle2D primaryScreenBounds) {
		this.rightPaneView = rightPaneView;
		this.primaryScreenBounds = primaryScreenBounds;
		double width = this.primaryScreenBounds.getWidth();
		this.rightPaneView.setMaxWidth((width/100)*30);
		
		Button exitBtn = rightPaneView.getExitBtn();
		exitBtn.addEventHandler(ActionEvent.ACTION,  exitBtnEvent());
		Button addGroup = rightPaneView.getAddGroup();
		addGroup.addEventHandler(ActionEvent.ACTION, addGroupEvent());
		Button addArtical = rightPaneView.getAddArtical();
		addArtical.addEventHandler(ActionEvent.ACTION, addArticalEvent());
	}
	
	private EventHandler<ActionEvent> exitBtnEvent(){
		EventHandler<ActionEvent> groupEvent = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		};
		return groupEvent;
	};
	
	private EventHandler<ActionEvent> addGroupEvent(){
		EventHandler<ActionEvent> addGroupEvent = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO modals for creating groups
				System.out.println("Add Group");
			}			
		};
		return addGroupEvent;	
	}
	
	private EventHandler<ActionEvent> addArticalEvent(){
		EventHandler<ActionEvent> addGroupEvent = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO modals for creating articals
				System.out.println("Add Artical");
				
			}			
		};
		return addGroupEvent;		
	}
}
