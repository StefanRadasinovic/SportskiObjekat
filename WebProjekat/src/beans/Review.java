package beans;

import enums.SportsObjectRating;

public class Review {

	private Buyer buyer;
	private SportsObject sportsObject;
	private String comment;
	private SportsObjectRating sportsObjectRating;
	private boolean deleted;
	
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public SportsObject getSportsObject() {
		return sportsObject;
	}
	public void setSportsObject(SportsObject sportsObject) {
		this.sportsObject = sportsObject;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public SportsObjectRating getSportsObjectRating() {
		return sportsObjectRating;
	}
	public void setSportsObjectRating(SportsObjectRating sportsObjectRating) {
		this.sportsObjectRating = sportsObjectRating;
	}
	public Review(Buyer buyer, SportsObject sportsObject, String comment, SportsObjectRating sportsObjectRating) {
		super();
		this.buyer = buyer;
		this.sportsObject = sportsObject;
		this.comment = comment;
		this.sportsObjectRating = sportsObjectRating;
		this.deleted = false;
	}
	
	public Review() {}
	
	
	
	
	
	
	
	
}
