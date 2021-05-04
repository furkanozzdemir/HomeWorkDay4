package GameSystem;

public class SellGame {
public void sellGame(Game game,Player player,Campaign campaign) {
	
	System.out.println(game.getName()+" oyunu "+player.getFirstName()+" "+player.getLastName()+"  tarafýndan  "+campaign.getName()+" kampanyasý ile ,"+" %"+game.getDiscount()+" indirim ile "+game.getDiscountedPrice()+" tl fiyattan satýn alýnmýþtýr");
}
}
