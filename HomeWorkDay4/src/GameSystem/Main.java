package GameSystem;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
Player furkan =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15185602566");



Player ahmet =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15187602566");
Player hamdi =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15185902566");
Player �mer  =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15180602566");
Player atom =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15185602511");
Player furkan1 =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15185602566");
Player feguli =new Player(1,"furkan","�zdemir",LocalDate.of(1999, 11, 15),"15187622566");

Player[] playerEdevlet = {ahmet,hamdi,�mer,atom,furkan1};

CheckPlayer�nfo check=new CheckPlayer�nfo(playerEdevlet);
check.playerVerification(furkan);
System.out.println("**************************************************************");
Game gta5 =new Game(1,"gta5","yeni s�r�m",140,0);
GameMenager gamemenager=new GameMenager();
gamemenager.addGame(gta5);
System.out.println("**************************************************************");
Campaign campaign=new Campaign("cad�lar bayram� ","15","cad�lar15");
CampaignMenager campaignMenager=new CampaignMenager();
campaignMenager.addCampaign(campaign);
System.out.println("**************************************************************");
SellGame sellgame=new SellGame();

sellgame.sellGame(gta5, furkan, campaign);






}}

