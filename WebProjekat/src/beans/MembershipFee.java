package beans;

import java.util.Date;

import enums.MembershipFeeType;
import enums.MembershipStatus;

public class MembershipFee {
	private String id;
	private MembershipFeeType membershipFeeType;
	private Date paying;
	private Date dateAndTime; //vreme vazenja 
	private double price;
	private Buyer buyer;
	private MembershipStatus membershipStatus;
	private double AppointmentAmount;
	
	
	
	public MembershipFee(String id, MembershipFeeType membershipFeeType, Date paying, Date dateAndTime, double price,
			Buyer buyer, MembershipStatus membershipStatus, double appointmentAmount) {
		super();
		this.id = id;
		this.membershipFeeType = membershipFeeType;
		this.paying = paying;
		this.dateAndTime = dateAndTime;
		this.price = price;
		this.buyer = buyer;
		this.membershipStatus = membershipStatus;
		AppointmentAmount = appointmentAmount;
	
		
	}
	
	public MembershipFee() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MembershipFeeType getMembershipFeeType() {
		return membershipFeeType;
	}

	public void setMembershipFeeType(MembershipFeeType membershipFeeType) {
		this.membershipFeeType = membershipFeeType;
	}

	public Date getPaying() {
		return paying;
	}

	public void setPaying(Date paying) {
		this.paying = paying;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public MembershipStatus getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(MembershipStatus membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

	public double getAppointmentAmount() {
		return AppointmentAmount;
	}

	public void setAppointmentAmount(double appointmentAmount) {
		AppointmentAmount = appointmentAmount;
	} 
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
