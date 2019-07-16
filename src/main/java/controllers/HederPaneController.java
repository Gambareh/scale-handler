package controllers;

import javafx.geometry.Rectangle2D;
import views.HederPaneView;

public class HederPaneController {
	private HederPaneView hederPaneView;
	private Rectangle2D primaryScreenBounds;
	
	public HederPaneController ( HederPaneView hederPaneView,Rectangle2D primaryScreenBounds) {
		this.hederPaneView = hederPaneView;
		this.primaryScreenBounds=primaryScreenBounds;
	}
}
