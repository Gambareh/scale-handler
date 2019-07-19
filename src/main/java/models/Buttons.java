package models;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;

public class Buttons extends Button{
	
	private String buttonCode,displayName,fullName;
	private boolean isActive;
 
	public Buttons () {
		
		setOnAction((ActionEvent e) -> {
			
		});
		
	}
	
	
	public String getButtonCode() {
		return buttonCode;
	}

	
	public void setButtonCode(String code) {
		this.buttonCode = code;
	}

	
	public String getDisplayName() {
		return displayName;
	}

	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		setText(displayName);
	}

	
	public String getFullName() {
		return fullName;
	}

	
	public void setFullName(String name) {
		this.fullName = name;
		
	}

	
	public boolean isActive() {
		return isActive;
	}

	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
