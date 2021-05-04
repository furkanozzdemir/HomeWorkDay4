package GameSystem;

public class PlayerMenager implements PlayerMenagerService {
	
	
	
	public PlayerMenager(){
		
		
	}
	
	
	public void updatePlayerÝnformation(Player player){
		System.out.println(player.getFirstName()+" "+player.getLastName()+"  bilgileriniz güncellendi");
		
		
	}
	public void deletePlayer(Player player){
		System.out.println(player.getFirstName()+"  "+player.getLastName()+"  kaydýnýz sistemden silinmiþtir");
		
		
	}
	


}
