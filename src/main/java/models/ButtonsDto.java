package models;


import java.util.ArrayList;
import java.util.List;

import domain.Artical;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import views.LeftPaneView;

public class ButtonsDto{
		private LeftPaneView leftPaneView;
		private Buttons bt;
		public ButtonsDto (LeftPaneView leftPaneView) {
			this.leftPaneView = leftPaneView;
			
		}
		
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
				Label lbl = leftPaneView.getArticalName();
				lbl.setText(tmp.getDisplayName());
				
				
			}
		};

		
		
		
}
