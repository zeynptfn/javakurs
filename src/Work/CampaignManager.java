package Work;

import Abstrut.CampanyService;
import Entitiy.Campaign;

public class CampaignManager implements CampanyService{

	@Override
	public void AddCampany(Campaign campaign) {
		System.out.println();
		
	}

	@Override
	public void RemoveCampany(Campaign campaign) {
		System.out.println(campaign.getCampaigName()+" kampanya silinmiştir.");
		
	}

	@Override
	public double UpdateCampany(Campaign campaign,int New) {
		System.out.println(campaign.getCampaigName()+"güncellenmiştir.");
		return New * campaign.getDisCount() / 100;
		
	}

}
