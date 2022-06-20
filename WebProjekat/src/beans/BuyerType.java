package beans;

import enums.BuyerTitle;

import enums.Gender;
import enums.Role;

public class BuyerType extends User {
	
	
	private BuyerTitle  buyertitle;
	private int discount;
	private int points;
	
	
	
	
	public BuyerTitle getBuyertitle() {
		return buyertitle;
	}
	public void setBuyertitle(BuyerTitle buyertitle) {
		this.buyertitle = buyertitle;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public BuyerType(String username, String password, String name, String surname, Gender gender, String birthDate,
			Role role, BuyerTitle buyertitle, int discount, int points) {
		super(username, password, name, surname, gender, birthDate, role);
		this.buyertitle = buyertitle;
		this.discount = discount;
		this.points = points;
	}
	
	
	public BuyerType() {}
	
	
	
	
	

}
