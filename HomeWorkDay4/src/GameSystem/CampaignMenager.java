package GameSystem;

public class CampaignMenager implements CampaignMenagerService{

	@Override
	public void addCampaign(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya eklenmiþtir");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya silinmiþtir");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya güncellenmiþtir");
	}

}
