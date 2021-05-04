package GameSystem;
import java.time.LocalDate;

public class CheckPlayerÝnfo {
   Player [] players;






public CheckPlayerÝnfo(Player[] players) {
	super();
	this.players = players;
}






public void playerVerification(Player player) {
	
	for(Player playerlist:players) {
		if(player.getNationalityNumber().equals(playerlist.nationalityNumber)) {
			System.out.println("kimlik doðrulamasý baþarýlý bir þekilde yapýldý");
			
			break;
		}else {
			
			System.out.println("aranýyor");
		}
		
		
	}
	
}
    



}
