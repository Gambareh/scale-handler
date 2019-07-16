package main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import controllers.HederPaneController;
import controllers.LeftPaneController;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import models.HibernateInit;
import views.HederPaneView;
import views.LeftPaneView;

public class MainTest extends ApplicationTest{
	
	private Stage primStage;
	
	@Override
	public void start(Stage primStage) throws Exception {
		this.primStage = primStage;
		BorderPane root = new BorderPane();
		 Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		LeftPaneView leftPaneView = new LeftPaneView(primaryScreenBounds);
		LeftPaneController controller = new LeftPaneController(leftPaneView,primaryScreenBounds);
		
		HederPaneView hederPaneView = new HederPaneView();
		HederPaneController hederPaneController = new HederPaneController(hederPaneView,primaryScreenBounds);
		
		root.setTop(hederPaneView);
		root.setLeft(leftPaneView);
		root.setId("root");
		
		Scene scene = new Scene(root,1024,780);
		scene.getStylesheets().add("css/application.css");
		this.primStage.setScene(scene);
		this.primStage.show();
	}
	
	@Before
	public void setup() {
	
	}
	
	@Test
	public void isStageSown() {
		assertTrue("Is primary stage shown: ",primStage.isShowing());
	};
	
	@Test
	public void isFullScreen() {
		assertFalse("Is full screen ",primStage.isFullScreen());
	}
	
	
	
	
}
