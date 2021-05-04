package GameSystem;

public class Campaign {

	private String name;
	private String campaignDuration;

	private String campaignCode;
	
	
	public String getName() {
		return name;
	}

	
	

	public Campaign(String name, String campaignDuration, String campaignCode) {
		this.name = name;
		this.campaignDuration = campaignDuration;
		this.campaignCode = campaignCode;
	}



	public void setName(String name) {
		this.name = name;
	}




	public String getCampaignDuration() {
		return campaignDuration;
	}




	public void setCampaignDuration(String campaignDuration) {
		this.campaignDuration = campaignDuration;
	}




	public String getCampaignCode() {
		return campaignCode;
	}




	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}




	
	
	
	
	

}
