package Entitiy;

public class Game {
	private int id;
	private String GameName;
	private double Price;
	private double PriceAfterDiscount;
	
	public Game() {}

	public Game(int id, String gameName, double price, double priceAfterDiscount) {
		super();
		this.id = id;
		GameName = gameName;
		Price = price;
		PriceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getPriceAfterDiscount(Campaign campaign) {
		PriceAfterDiscount = Price - (Price * campaign.getDisCount() / 100);
		return PriceAfterDiscount ;
		
	}

	
	
	

}
