package views;

import domain.Artical;
import domain.Groups;
import domain.Users;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import models.ArticalDataModel;
import models.GroupDataModel;
import models.UserData;
import models.UserDataModel;

public class RightPaneView extends VBox {
	private Button exitBtn;
	private Rectangle2D primaryScreenBounds;
	public RightPaneView (Rectangle2D primaryScreenBounds) {
		this.primaryScreenBounds=primaryScreenBounds;
		double width = this.primaryScreenBounds.getWidth();
		double height = this.primaryScreenBounds.getHeight();
		
		exitBtn = new Button("Exit");
		exitBtn.setPrefSize(exitBtnWidth(width)/2, exitBtnWidth(width)/2);
		
		
		VBox btnExitBox = new VBox();
		Button addUsers = new Button("AddUser");
		Button addGroups = new Button("AddGroup");
		Button addArtical = new Button("AddArtical");
		btnExitBox.getChildren().addAll(exitBtn);
		btnExitBox.setAlignment(Pos.BOTTOM_CENTER);
		btnExitBox.setStyle("-fx-border-style:solid");
		btnExitBox.setPadding(new Insets(10));
		VBox.setVgrow(btnExitBox, Priority.ALWAYS);
		this.getChildren().addAll(addUsers,addGroups,addArtical,btnExitBox);
		VBox.setVgrow(this, Priority.ALWAYS);
		this.setStyle("-fx-border-style:solid");
		this.setSpacing(10);
		
		addUsers.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
//				System.out.println("User Print");
//				Users u = new Users();
//				u.setId(123456789);
//				u.setActive(true);
//				u.setFirst_name("Vladimir");
//				u.setLast_name("Blagojevic");
//				
//				UserDataModel userModel = new UserDataModel();
//				userModel.save(u);
//				System.out.println("User Print");
				
			}
		});
		
		addGroups.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Groups groups = new Groups();
				groups.setGroupName("Sweets");
				GroupDataModel ggg = new GroupDataModel();
				ggg.save(groups);
				
			}
		});

		addArtical.setOnAction(new EventHandler<ActionEvent>() {
	
		@Override
		public void handle(ActionEvent event) {
			Artical a = new Artical();
			Groups groups = new Groups();
			groups.setGroup_id(2);
		
			Users u = new Users();
			u.setId(123456789);
		
			a.setCode(2000);
			a.setDisplay_name("Kupus");
			a.setName("Zeleni Kupus");
			a.setGroups(groups);
			a.setUser(u);
			a.setActive(true);
			
			ArticalDataModel aaa = new ArticalDataModel();
			aaa.save(a);
			
			
		}
		});
		
		
	}
	
//Main container width
	private Double exitBtnWidth(double width) {
		return width*((double)20/100);
	}
	
	//scaleBox height
	private Double exitBtnHeight(double height) {
		return height*((double)10/100);
	}
	
	public Button getExitBtn() {
		return exitBtn;
	}
	
	public void setExitBtn(Button exitBtn) {
		this.exitBtn = exitBtn;
	}
}
