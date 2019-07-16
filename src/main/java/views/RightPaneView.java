package views;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class RightPaneView extends VBox {
	
	public RightPaneView () {
		TextField field = new TextField();
		this.getChildren().add(field);
	}
}
