package GameSystem;

public class PlayerMenager implements PlayerMenagerService {
	
	
	
	public PlayerMenager(){
		
		
	}
	
	
	public void updatePlayer�nformation(Player player){
		System.out.println(player.getFirstName()+" "+player.getLastName()+"  bilgileriniz g�ncellendi");
		
		
	}
	public void deletePlayer(Player player){
		System.out.println(player.getFirstName()+"  "+player.getLastName()+"  kayd�n�z sistemden silinmi�tir");
		
		
	}
	


}
