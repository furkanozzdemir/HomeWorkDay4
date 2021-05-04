package GameSystem;

public class CampaignMenager implements CampaignMenagerService{

	@Override
	public void addCampaign(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya eklenmiştir");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya silinmiştir");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya güncellenmiştir");
	}

}
