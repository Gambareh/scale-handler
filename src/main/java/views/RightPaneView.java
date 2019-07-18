package views;

import domain.Users;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import models.UserData;
import models.UserDataModel;

public class RightPaneView extends VBox {
	
	public RightPaneView () {
		Button addUsers = new Button("AddUser");
		Button addGroups = new Button("AddGroup");
		Button addArtical = new Button("AddArtical");
		this.getChildren().addAll(addUsers,addGroups,addArtical);
		
		addUsers.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("User Print");
				Users u = new Users();
				u.setId(123456789);
				u.setActive(true);
				u.setFirst_name("Vladimir");
				u.setLast_name("Blagojevic");
				
				UserDataModel userModel = new UserDataModel();
				userModel.save(u);
				System.out.println("User Print");
				
			}
		});
		
		addGroups.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
			}
		});

		addArtical.setOnAction(new EventHandler<ActionEvent>() {
	
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}
		});
	}
}
