package main;


import controllers.LeftPaneController;
import controllers.RightPaneController;
import controllers.CenterPaneController;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.ArticalDataModel;
import models.HibernateInit;
import views.HederPaneView;
import views.LeftPaneView;
import views.RightPaneView;
import views.CenterPaneView;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage primStage) throws Exception {
		
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		System.out.println(primaryScreenBounds.getWidth());
		
		BorderPane root = new BorderPane();
		
		ArticalDataModel dataModel = new ArticalDataModel();
		
		LeftPaneView leftPaneView = new LeftPaneView(primaryScreenBounds);
		HederPaneView hederPaneView = new HederPaneView(primaryScreenBounds);
		CenterPaneView centerPaneView = new CenterPaneView();
		RightPaneView rightPaneView = new RightPaneView();
	
		
		CenterPaneController centerPaneController = new CenterPaneController(
				leftPaneView,
				hederPaneView,
				centerPaneView,
				rightPaneView,
				dataModel,
				primaryScreenBounds);
		
		
		root.setTop(hederPaneView);
		root.setLeft(leftPaneView);
		root.setCenter(centerPaneView);
		root.setRight(rightPaneView);
		
		root.setId("root");
		
		Scene scene = new Scene(root,1024,780);
		scene.getStylesheets().add("css/application.css");
		primStage.setScene(scene);
		primStage.setFullScreen(true);
		primStage.initStyle(StageStyle.UNDECORATED);
		primStage.show();
		
		
	}
	
	@Override
	public void init() throws Exception {
		HibernateInit.getSessionFactory();
		
	}
	
}
