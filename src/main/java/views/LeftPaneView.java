package views;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class LeftPaneView extends HBox {
	private TextField weightField,taraField;
	private Button stableBtn,taraBtn,printBtn,cancelLastPrint;
	private VBox scaleBox,stableBox,emptyBox,taraBox,currentMeasureBox,printBox;
	private Rectangle2D primaryScreenBounds;
	
	
	public LeftPaneView (Rectangle2D primaryScreenBounds) {
		this.primaryScreenBounds=primaryScreenBounds;
		double width = this.primaryScreenBounds.getWidth();
		double height = this.primaryScreenBounds.getHeight();
		System.out.println(scaleBoxHeight(height));
		
		VBox wreperBox = new VBox();	
		
		 scaleBox = new VBox();
				Label scaleLbl = new Label("Weight in kilograms");
				weightField = new TextField();
				weightField.setId("weightFld");
				weightField.setEditable(false);
				weightField.setPrefSize(containerWidth(width), 60);
			scaleBox.getChildren().addAll(scaleLbl,weightField);
			scaleBox.setPrefSize(containerWidth(width), scaleBoxHeight(height));
			scaleBox.setId("scaleBox");
			
		 stableBox = new VBox();
				stableBtn = new Button("Stable");
				stableBtn.setId("unstableBtn");
				stableBtn.setPrefSize(containerWidth(width), 60);
			stableBox.getChildren().add(stableBtn);
			stableBox.setId("scaleBox");
			stableBox.setPrefSize(containerWidth(width),stableBoxHeight(height));
			
		 emptyBox = new VBox();
		 emptyBox.setId("emptyBox");
			
		 taraBox = new VBox();
				Label taraLbl = new Label("Tara");
				taraField = new TextField();
				taraField.setPrefSize(containerWidth(width), 60);
				taraBtn = new Button("Tara");
				taraBtn.setPrefSize(containerWidth(width), 60);
		 taraBox.getChildren().addAll(taraLbl,taraField,taraBtn);
		 taraBox.setId("taraBox");
		 taraBox.setPrefSize(containerWidth(width), taraBoxHeight(height));
			
		 currentMeasureBox = new VBox();
				Label currentArtical = new Label("Current Artical");
				Label articalName = new Label("--------");
				Label currentWeight = new Label("Current Weight");
				Label articalWeight = new Label("--------");
				
		 currentMeasureBox.getChildren().addAll(currentArtical,articalName,currentWeight,articalWeight);
		 currentMeasureBox.setId("currentBox");
		 currentMeasureBox.setPrefSize(containerWidth(width), measureBoxHeight(height));
		
			
		 printBox = new VBox();
		 		HBox wrepPBox = new HBox();
				printBtn = new Button("Print");
				printBtn.setPrefSize(containerWidth(width)/2, containerWidth(width)/2);
				cancelLastPrint = new Button("Cancel Last Print");
				cancelLastPrint.setPrefSize(containerWidth(width)/2, containerWidth(width)/2);
				wrepPBox.getChildren().addAll(printBtn,cancelLastPrint);
				wrepPBox.setSpacing(5);
			printBox.setId("printBox");
			printBox.setAlignment(Pos.BOTTOM_CENTER);
			printBox.setPrefSize(containerWidth(width), printBoxHeight(height));
			printBox.getChildren().addAll(wrepPBox);
			
			VBox.setVgrow(printBox, Priority.ALWAYS);
				
		wreperBox.getChildren().addAll(scaleBox,stableBox,emptyBox,taraBox,currentMeasureBox,printBox);
		wreperBox.setId("left-pane");
	
		this.getStylesheets().add("css/left-pane.css");
		this.getChildren().addAll(wreperBox);
		this.setPrefSize(containerWidth(width), height);
	}
	
	//Main container width
	private Double containerWidth(double width) {
		return width*((double)20/100);
	}
	
	//scaleBox height
	private Double scaleBoxHeight(double height) {
		return height*((double)10/100);
	}
	
//stableBox height
	private Double stableBoxHeight(double height) {
		return height*((double)10/100);
	}
	
//taraBox height
	private Double taraBoxHeight(double height) {
		return height*((double)20/100);
	}
	
//measureBox height
	private Double measureBoxHeight(double height) {
		return height*((double)20/100);
	}

//printBox height
	private Double printBoxHeight(double height) {
		return height*((double)20/100);
	}
	
	public TextField getWeightField() {
		return weightField;
	}
	
	
	public void setWeightField(TextField weightField) {
		this.weightField = weightField;
	}
	
	public Button getStableBtn() {
		return stableBtn;
	}

	public TextField getTaraField() {
		return taraField;
	}

	public Button getTaraBtn() {
		return taraBtn;
	}

	public Button getPrintBtn() {
		return printBtn;
	}
	
	public Button getCancelLastPrint() {
		return cancelLastPrint;
	}

	
	public VBox getScaleBox() {
		return scaleBox;
	}

	
	public void setScaleBox(VBox scaleBox) {
		this.scaleBox = scaleBox;
	}

	
	public VBox getStableBox() {
		return stableBox;
	}

	
	public void setStableBox(VBox stableBox) {
		this.stableBox = stableBox;
	}

	
	public VBox getEmptyBox() {
		return emptyBox;
	}

	
	public void setEmptyBox(VBox emptyBox) {
		this.emptyBox = emptyBox;
	}

	
	public VBox getTaraBox() {
		return taraBox;
	}

	
	public void setTaraBox(VBox taraBox) {
		this.taraBox = taraBox;
	}

	
	public VBox getCurrentMeasureBox() {
		return currentMeasureBox;
	}

	
	public void setCurrentMeasureBox(VBox currentMeasureBox) {
		this.currentMeasureBox = currentMeasureBox;
	}

	
	public VBox getPrintBox() {
		return printBox;
	}

	
	public void setPrintBox(VBox printBox) {
		this.printBox = printBox;
	}
	
	
	
}
