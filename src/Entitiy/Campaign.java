package Entitiy;

public class Campaign {
	private int id;
	private String CampaigName;
	private double DisCount;
	private boolean ÝsActive;
	
	public Campaign () {}

	public Campaign(int id, String campaigName, double disCount, boolean isActive) {
		super();
		this.id = id;
		CampaigName = campaigName;
		DisCount = disCount;
		ÝsActive = isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaigName() {
		return CampaigName;
	}

	public void setCampaigName(String campaigName) {
		CampaigName = campaigName;
	}

	public double getDisCount() {
		return DisCount;
	}

	public void setDisCount(double disCount) {
		DisCount = disCount;
	}

	public boolean getÝsActive() {
		return ÝsActive;
	}

	public void setÝsActive(boolean isActive) {
		ÝsActive = isActive;
	}
	
	

}
