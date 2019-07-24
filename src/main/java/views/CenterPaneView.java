package views;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;



public class CenterPaneView extends VBox{
	private VBox wrapPane;

	public CenterPaneView () {
		wrapPane = new VBox();
		wrapPane.setId("wreapPane");
		this.setId("right-pane");
		this.getChildren().addAll(wrapPane);
		this.getStylesheets().add("css/right-pane.css");
	}


	
	public VBox getWrapPane() {
		return wrapPane;
	}

	public void setWrapPane(VBox wrapPane) {
		this.wrapPane = wrapPane;
	}
	
	
	
}
