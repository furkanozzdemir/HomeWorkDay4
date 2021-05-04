package GameSystem;

public class CampaignMenager implements CampaignMenagerService{

	@Override
	public void addCampaign(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya eklenmi�tir");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya silinmi�tir");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya g�ncellenmi�tir");
	}

}
