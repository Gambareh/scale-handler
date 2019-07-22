package views;

import domain.Artical;
import domain.Groups;
import domain.Users;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import models.ArticalDataModel;
import models.GroupDataModel;
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
}
