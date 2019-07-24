package controllers;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import models.ArticalDataModel;
import models.GroupButtons;
import models.GroupButtonsDto;
import models.GroupDataModel;
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
		
		double width = primaryScreenBounds.getWidth();
		double height = primaryScreenBounds.getHeight();
		
		GroupDataModel groupDataModel = new GroupDataModel();
		
		ArticalButtonsDto buttonsDto = new ArticalButtonsDto(this.leftPaneView);
		GroupButtonsDto groupButtonsDto = new GroupButtonsDto();
		groupButtonsDto.setEvent(groupEvent());
		
		//center-pane
		FlowPane wreap = this.centerView.getWrapPane();
		List<ArticalButtons> buttons = buttonsDto.getArticalButtons(this.dataModel.getAllArtical());
		wreap.getChildren().addAll(buttons);
		
		//heder-pane 
		VBox scrollPane = this.hederPaneView.getGroupBoxScroll();
		scrollPane.setPrefSize(width, scrollBoxHeight(height));
		
		List<GroupButtons> groupButtons = groupButtonsDto.getGroupButtons(groupDataModel.getAllGroups());
		
		FlowPane scrolFPane = scrollFlowPane();
		scrolFPane.getChildren().addAll(groupButtons);
		scrolFPane.prefWidthProperty().bind(scrollPane.widthProperty());
		
		ScrollPane pane = scrollPane();
		pane.setContent(scrolFPane);
		
		scrollPane.getChildren().addAll(pane);
		
		//right pane view
		Button exitBtn = rightPaneView.getExitBtn();
		exitBtn.addEventHandler(ActionEvent.ACTION,  exitBtnEvent());
		
		
	}
	
	private EventHandler<ActionEvent> groupEvent(){
		EventHandler<ActionEvent> groupEvent = new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello group");
			}
		};
		return groupEvent;
		};
	
	private EventHandler<ActionEvent> exitBtnEvent(){
		EventHandler<ActionEvent> groupEvent = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		};
		return groupEvent;
		};
	
	
	/*
	 * This is flow pane witch fit into 
	 * scroll pane 
	 */
	private FlowPane scrollFlowPane() {
		FlowPane flowPane = new FlowPane();
		flowPane.setVgap(5);
		flowPane.setHgap(5);
		return flowPane;
	}
	
	/*
	 * Scroll pane for group btns.
	 */
	private ScrollPane scrollPane() {
		ScrollPane pane = new ScrollPane();
		return pane;
		
	}
	
	private Double scrollBoxHeight(double height) {
		return height*((double)30/100);
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
