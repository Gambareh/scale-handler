package controllers;

import java.util.Random;

import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.TextField;
import models.ArticalDataModel;
import views.LeftPaneView;

public class LeftPaneController {
	private LeftPaneView leftPaneView;
	private Rectangle2D primaryScreenBounds;
	
	
	
	public LeftPaneController (LeftPaneView leftPaneView,Rectangle2D primaryScreenBounds) {
		this.leftPaneView = leftPaneView;
		this.primaryScreenBounds=primaryScreenBounds;

	}
	
	public LeftPaneView getLeftPaneView() {
		return leftPaneView;
	}
	
	
	
}
