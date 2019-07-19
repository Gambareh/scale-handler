package models;


import java.util.ArrayList;
import java.util.List;

import domain.Artical;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import views.LeftPaneView;

public class ArticalButtonsDto{
	
		private LeftPaneView leftPaneView;
		private ArticalButtons bt;
		
		public ArticalButtonsDto (LeftPaneView leftPaneView) {
			this.leftPaneView = leftPaneView;
			
		}
		/**
		 * Converts articals to buttons and add action event
		 * @param List<Artical> 
		 * @return List<Buttons>
		 */
		public List<ArticalButtons> getArticalButtons(List<Artical> articals) {
			List<ArticalButtons> btns = new ArrayList<ArticalButtons>();
			if(articals!=null) {
			for(Artical artical : articals) {
				
				bt = new ArticalButtons();
				bt.setButtonCode(String.valueOf(artical.getCode()));
				bt.setDisplayName(artical.getDisplay_name());
				bt.setFullName(artical.getName());
				bt.setActive(artical.isActive());
				bt.addEventHandler(ActionEvent.ACTION, event);		
				btns.add(bt);
						
			}			
		}
			return btns;
		}
		
		public void buttonEventPressed(ActionEvent event) {
			ArticalButtons button = (ArticalButtons) event.getSource();
			System.out.println(button.getButtonCode());
		}
	
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				ArticalButtons tmp = (ArticalButtons) event.getSource();
				Label lblName = leftPaneView.getArticalName();
				Label lblCode = leftPaneView.getArticalCode();
				lblName.setText(tmp.getDisplayName());
				lblCode.setText(tmp.getButtonCode());	
			}
		};

		
		
		
}
