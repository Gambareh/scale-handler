package controllers;

import java.util.List;

import javafx.geometry.Rectangle2D;
import javafx.scene.layout.FlowPane;
import models.ArticalDataModel;
import models.ArticalButtons;
import models.ArticalButtonsDto;
import views.CenterPaneView;
import views.HederPaneView;
import views.LeftPaneView;
import views.RightPaneView;

public class CenterPaneController  {
	
	private ArticalDataModel dataModel;
	private CenterPaneView centerView;
	private LeftPaneView leftPaneView;
	private HederPaneView hederPaneView;
	private ArticalDataModel articalDataModel;
	private RightPaneView rightPaneView;
	private Rectangle2D primaryScreenBounds;
	
	public CenterPaneController ( 
			LeftPaneView leftPaneView,
			HederPaneView hederPaneView,
			CenterPaneView centerView,	
			RightPaneView rightPaneView,
			ArticalDataModel articalDataModel,
			Rectangle2D primaryScreenBounds) {
		
		this.dataModel =articalDataModel;
		this.centerView = centerView;
		this.primaryScreenBounds=primaryScreenBounds;
		this.leftPaneView =leftPaneView;
		this.rightPaneView = rightPaneView;
		this.hederPaneView = hederPaneView; 
		
		ArticalButtonsDto buttonsDto = new ArticalButtonsDto(this.leftPaneView);
		
		FlowPane wreap = this.centerView.getWrapPane();
		List<ArticalButtons> buttons = buttonsDto.getArticalButtons(this.dataModel.getAllArtical());
		wreap.getChildren().addAll(buttons);
		
		
		
	}
	
	public ArticalDataModel getDataModel() {
		return dataModel;
	}
	
	public void setDataModel(ArticalDataModel dataModel) {
		this.dataModel = dataModel;
	}

	
	public CenterPaneView getCenterView() {
		return centerView;
	}

	
	public void setCenterView(CenterPaneView centerView) {
		this.centerView = centerView;
	}

	
	public LeftPaneView getLeftPaneView() {
		return leftPaneView;
	}

	
	public void setLeftPaneView(LeftPaneView leftPaneView) {
		this.leftPaneView = leftPaneView;
	}

	
	public HederPaneView getHederPaneView() {
		return hederPaneView;
	}

	
	public void setHederPaneView(HederPaneView hederPaneView) {
		this.hederPaneView = hederPaneView;
	}

	
	public ArticalDataModel getArticalDataModel() {
		return articalDataModel;
	}

	
	public void setArticalDataModel(ArticalDataModel articalDataModel) {
		this.articalDataModel = articalDataModel;
	}
	
	
}
