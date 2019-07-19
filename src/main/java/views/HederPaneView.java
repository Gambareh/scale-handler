package views;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class HederPaneView extends VBox {
	private TextField usernameField,passwordField;
	private Button logInBtn;
	private VBox groupBoxScroll;
	
	
	public HederPaneView (Rectangle2D primaryScreenBounds) {
		
		double width = primaryScreenBounds.getWidth();
		double height = primaryScreenBounds.getHeight();
		
		VBox wrepBox = new VBox();
			
			VBox groupBox = new VBox();
				Label usernameLbl = new Label("Choose group of articals");
			groupBox.getChildren().addAll(usernameLbl);
			
		  groupBoxScroll = new VBox();
				ScrollPane pane = new ScrollPane();
				FlowPane buttonPane = new FlowPane();
				
				System.out.println();
				List<Button>buttons = new ArrayList<Button>();
				for(int i = 0; i<30;i++) { 
					Button tmp = new Button("Group 1");
					
					buttons.add(tmp);			 
				}
				for(Button b:buttons) {
					b.setPrefSize(200,100);
				
				}
				
				buttonPane.getChildren().addAll(buttons);		
				buttonPane.setPrefWidth(width);
				buttonPane.setHgap(5);
				buttonPane.setVgap(5);
				buttonPane.setStyle("-fx-border-style:solid");
				pane.setContent(buttonPane);
				pane.setPrefWidth(width);
				pane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
				pane.setHbarPolicy(ScrollBarPolicy.NEVER);
			groupBoxScroll.getChildren().add(pane);
			groupBoxScroll.setPrefWidth(width);
			groupBoxScroll.setMaxHeight(scrollBoxHeight(height));
			groupBoxScroll.setPrefHeight(scrollPrefBoxHeight(height));

		wrepBox.getChildren().addAll(groupBoxScroll);

		Line line = new Line(10, 0, 1000, 0);
		line.setId("line");
		
		this.setId("heder-pane");
		this.getChildren().addAll(wrepBox,line);
		this.getStylesheets().add("css/heder-pane.css");
	
	}
	
	private Double scrollBoxHeight(double height) {
		return height*((double)30/100);
	}
	
	private Double scrollPrefBoxHeight(double height) {
		return height*((double)20/100);
	}
	
	public VBox getGroupBoxScroll() {
		return groupBoxScroll;
	}
	
	public void setGroupBoxScroll(VBox groupBoxScroll) {
		this.groupBoxScroll = groupBoxScroll;
	}
	
}
