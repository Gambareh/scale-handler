package controllers;

import javafx.geometry.Rectangle2D;
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
	}
}
