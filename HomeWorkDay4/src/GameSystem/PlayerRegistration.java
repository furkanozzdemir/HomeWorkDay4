package GameSystem;
import java.time.LocalDate;

public class PlayerRegistration extends Player {
	
	private  String userName;
	private  String password;
	
	
	public PlayerRegistration(int id, String firstName, String lastName, LocalDate datetime, String nationalityNumber,String userName,String password) {
		super(id, firstName, lastName, datetime, nationalityNumber);
		this.userName=userName;
		this.password=password;
		System.out.println(firstName+" "+lastName+"sisteme baþarýlý bir þekilde kayýt oldunuz");
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	

	}
	


