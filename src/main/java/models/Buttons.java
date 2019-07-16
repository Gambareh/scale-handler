package models;

import javafx.scene.control.Button;

public class Buttons extends Button{
	
	private String buttonCode,displayName,fullName;
	private boolean isActive;
  
	
	//Builder class
	public static class ButtonBuilder{
		
		private String buttonCode,displayName,name;
		private boolean isActive;
	
		public ButtonBuilder (String code) {
		this.buttonCode = code;
		}
		
		public ButtonBuilder showDispName(String dispName) {
			this.displayName = dispName;
			return this;
		}
		
		public ButtonBuilder showFullName(String fullName) {
			this.name = fullName;
			return this;
		}
		
		public ButtonBuilder isActive(boolean isActive) {
			this.isActive = isActive;
			return this;
		}
		
		public Buttons build() {
			Buttons btn = new Buttons();
			btn.setButtonCode(this.buttonCode);
			btn.setDisplayName(this.displayName);
			btn.setFullName(this.name);
			btn.setActive(this.isActive);
			return btn;
			
		}
	
	}
	
	private Buttons () {
		
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
