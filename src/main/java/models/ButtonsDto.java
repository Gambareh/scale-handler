package models;

import java.util.ArrayList;
import java.util.List;

import domain.Artical;

public class ButtonsDto {
		
		public ButtonsDto () {
			
		}
		
		public List<Buttons> getArticalButtons(List<Artical> articals) {
			List<Buttons> btns = new ArrayList<Buttons>();
			if(articals!=null) {
			for(Artical artical : articals) {
				Buttons bt = new Buttons.ButtonBuilder(String.valueOf(artical.getCode()))
						.showDispName(artical.getDisplay_name())
						.showFullName(artical.getName())
						.isActive(artical.isActive())
						.build();
				
				System.out.println(artical.getDisplay_name());
				
				btns.add(bt);
						
			}
			}
			return btns;
		}
		
		
}
