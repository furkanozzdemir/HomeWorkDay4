package GameSystem;
import java.time.LocalDate;

public class CheckPlayer�nfo {
   Player [] players;






public CheckPlayer�nfo(Player[] players) {
	super();
	this.players = players;
}






public void playerVerification(Player player) {
	
	for(Player playerlist:players) {
		if(player.getNationalityNumber().equals(playerlist.nationalityNumber)) {
			System.out.println("kimlik do�rulamas� ba�ar�l� bir �ekilde yap�ld�");
			
			break;
		}else {
			
			System.out.println("aran�yor");
		}
		
		
	}
	
}
    



}
