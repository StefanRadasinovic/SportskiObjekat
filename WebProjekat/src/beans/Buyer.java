package beans;

import java.util.List;

import enums.Gender;
import enums.Role;

public class Buyer extends User {

	private MembershipFee memberhipFee;
	private List<SportsObject> sportsObject;
	private int points;
	private boolean blocked;

	
	
	
    public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	
	
	public MembershipFee getMemberhipFee() {
		return memberhipFee;
	}
	public void setMemberhipFee(MembershipFee memberhipFee) {
		this.memberhipFee = memberhipFee;
	}
	public List<SportsObject> getSportsObject() {
		return sportsObject;
	}
	public void setSportsObject(List<SportsObject> sportsObject) {
		this.sportsObject = sportsObject;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
	
	
	

	public Buyer(String username, String password, String name, String surname, Gender gender, String birthDate,
			Role role, MembershipFee memberhipFee, List<SportsObject> sportsObject, int points) {
		super(username, password, name, surname, gender, birthDate, role);
		this.memberhipFee = memberhipFee;
		this.sportsObject = sportsObject;
		this.points = points;
	}
	public Buyer() {}
	
	
	
	
}
