package controllers;

import java.util.List;

import domain.Artical;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
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
	private Rectangle2D primaryScreenBounds;
	
	public CenterPaneController ( 
			LeftPaneView leftPaneView,
			HederPaneView hederPaneView,
			CenterPaneView centerView,	
			ArticalDataModel articalDataModel,
			Rectangle2D primaryScreenBounds) {
		
		this.dataModel =articalDataModel;
		this.centerView = centerView;
		this.primaryScreenBounds=primaryScreenBounds;
		this.leftPaneView =leftPaneView;
		this.hederPaneView = hederPaneView; 
		
		double width = primaryScreenBounds.getWidth();
		double height = primaryScreenBounds.getHeight();
		
		GroupDataModel groupDataModel = new GroupDataModel();
		
		ArticalButtonsDto buttonsDto = new ArticalButtonsDto(this.leftPaneView);
		GroupButtonsDto groupButtonsDto = new GroupButtonsDto();
		groupButtonsDto.setEvent(groupEvent());
		
		//center-pane
		int pageIndex =0;
		List<ArticalButtons> buttons = buttonsDto.getArticalButtons(this.dataModel.getAllArtical());
		Pagination articalPagination = new Pagination();
		articalPagination.setPageCount(2);
		articalPagination.setPrefHeight(paginBoxHeight(height));
		articalPagination.setPageFactory(new Callback<Integer, Node>() {
			
			@Override
			public Node call(Integer pageIndex) {
			
      	return createPage(buttons,pageIndex);
      
				
			}
		});
		VBox wrap =this.centerView.getWrapPane();
		wrap.getChildren().add(articalPagination);
		
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
	
	 private int itemsPerPage() {
     return 1;
 }
	
	private FlowPane createPage(List<ArticalButtons> listaArtikla,int pageIndex) {
		System.out.println("Create okinava");
		int page = pageIndex * itemsPerPage();
		FlowPane wreap = new FlowPane();
		for(int i=page;i<(pageIndex+1)*itemsPerPage();i++) {
			System.out.println(i);
			if(i<=listaArtikla.size()) {
			ArticalButtons articalButtons = listaArtikla.get(i);
			wreap.getChildren().addAll(articalButtons);
			}
		}
		return wreap;
		
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
	
	private Double paginBoxHeight(double height) {
		return height*((double)70/100);
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
