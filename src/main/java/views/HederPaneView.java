package views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class HederPaneView extends VBox {
	private TextField usernameField,passwordField;
	private Button logInBtn;
	
	public HederPaneView () {
		
		
		VBox wrepBox = new VBox();
			
			HBox groupBox = new HBox();
				Label usernameLbl = new Label("Choose group of articals");
			groupBox.getChildren().addAll(usernameLbl);

		wrepBox.getChildren().addAll(groupBox);

		Line line = new Line(10, 0, 1000, 0);
		line.setId("line");
		
		this.setId("heder-pane");
		this.getChildren().addAll(wrepBox,line);
		this.getStylesheets().add("css/heder-pane.css");
	
	}
	
}
