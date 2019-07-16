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
			
			HBox usernameBox = new HBox();
				Label usernameLbl = new Label("Your username: ");
				usernameField = new TextField();
			usernameBox.getChildren().addAll(usernameLbl,usernameField);
			
			HBox passwordBox = new HBox();
				Label passwordLbl = new Label("Your password: ");
				passwordField = new TextField();
			passwordBox.getChildren().addAll(passwordLbl,passwordField);
			
		wrepBox.getChildren().addAll(usernameBox,passwordBox);
			
			VBox loginBtnBox = new VBox();
				logInBtn = new Button("Login");
				logInBtn.setId("login-button");
			loginBtnBox.getChildren().addAll(logInBtn);
			loginBtnBox.setId("login-btn-box");
			
		
		Line line = new Line(10, 0, 1000, 0);
		line.setId("line");
		
		this.setId("heder-pane");
		this.getChildren().addAll(wrepBox,loginBtnBox,line);
		this.getStylesheets().add("css/heder-pane.css");
	
	}
	
}
