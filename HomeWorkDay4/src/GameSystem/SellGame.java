package GameSystem;

public class SellGame {
public void sellGame(Game game,Player player,Campaign campaign) {
	
	System.out.println(game.getName()+" oyunu "+player.getFirstName()+" "+player.getLastName()+"  taraf�ndan  "+campaign.getName()+" kampanyas� ile ,"+" %"+game.getDiscount()+" indirim ile "+game.getDiscountedPrice()+" tl fiyattan sat�n al�nm��t�r");
}
}
