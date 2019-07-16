package views;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;



public class CenterPaneView extends VBox{
	private FlowPane wrapPane;

	public CenterPaneView () {
		wrapPane = new FlowPane();
		wrapPane.setId("wreapPane");
		this.setId("right-pane");
		this.getChildren().addAll(wrapPane);
		this.getStylesheets().add("css/right-pane.css");
	}


	
	public FlowPane getWrapPane() {
		return wrapPane;
	}

	public void setWrapPane(FlowPane wrapPane) {
		this.wrapPane = wrapPane;
	}
	
	
	
}
