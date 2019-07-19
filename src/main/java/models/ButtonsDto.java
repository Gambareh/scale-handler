package models;


import java.util.ArrayList;
import java.util.List;

import domain.Artical;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import views.LeftPaneView;

public class ButtonsDto{
	
		private LeftPaneView leftPaneView;
		private Buttons bt;
		
		public ButtonsDto (LeftPaneView leftPaneView) {
			this.leftPaneView = leftPaneView;
			
		}
		/**
		 * Converts articals to buttons and add action event
		 * @param List<Artical> 
		 * @return List<Buttons>
		 */
		public List<Buttons> getArticalButtons(List<Artical> articals) {
			List<Buttons> btns = new ArrayList<Buttons>();
			if(articals!=null) {
			for(Artical artical : articals) {
				
				bt = new Buttons();
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
			Buttons button = (Buttons) event.getSource();
			System.out.println(button.getButtonCode());
		}
	
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Buttons tmp = (Buttons) event.getSource();
				Label lblName = leftPaneView.getArticalName();
				Label lblCode = leftPaneView.getArticalCode();
				lblName.setText(tmp.getDisplayName());
				lblCode.setText(tmp.getButtonCode());	
			}
		};

		
		
		
}
