package controllers;

import java.util.List;

import javafx.geometry.Rectangle2D;
import javafx.scene.layout.FlowPane;
import models.ArticalDataModel;
import models.Buttons;
import models.ButtonsDto;
import views.CenterPaneView;
import views.LeftPaneView;

public class CenterPaneController {
	
	private ArticalDataModel dataModel;
	private CenterPaneView centerView;
	private LeftPaneView leftPaneView; 
	private Rectangle2D primaryScreenBounds;
	
	public CenterPaneController (CenterPaneView centerView,LeftPaneView leftPaneView ,ArticalDataModel dataModel,Rectangle2D primaryScreenBounds) {
		this.dataModel = dataModel;
		this.centerView = centerView;
		this.primaryScreenBounds=primaryScreenBounds;
		this.leftPaneView = leftPaneView;
		
		double width = this.primaryScreenBounds.getWidth();
		this.centerView.setMaxWidth((width/100)*60);
		
		ButtonsDto buttonsDto = new ButtonsDto(leftPaneView);
		
		
		FlowPane wreap = this.centerView.getWrapPane();
		List<Buttons> buttons = buttonsDto.getArticalButtons(this.dataModel.getAllArtical());
		wreap.getChildren().addAll(buttons);
		
		
		
	}
	
	public ArticalDataModel getDataModel() {
		return dataModel;
	}
	
	public void setDataModel(ArticalDataModel dataModel) {
		this.dataModel = dataModel;
	}
}
