package GameSystem;

public class GameMenager implements GameMenagerService {
  


	
	
	public void addGame(Game game ){
		System.out.println(game.getName()+" oyunu eklendi");
		
		
	}
	
	public void updateGame(Game game ){
		System.out.println(game.getName()+" oyunu gŁncellendi");
		
		
	}
	
	public void deletegame(Game game ){
		System.out.println(game.getName()+" oyunu silindi");
		
		
	}
	
	
	
}
