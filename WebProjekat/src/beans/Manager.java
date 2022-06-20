package beans;

public class Manager extends User {
	private SportsObject sportsObject;

	public SportsObject getSportsObject() {
		return sportsObject;
	}

	public void setSportsObject(SportsObject sportsObject) {
		this.sportsObject = sportsObject;
	}

	public Manager(SportsObject sportsObject) {
		super();
		this.sportsObject = sportsObject;
	}
	
	
	public Manager() {}

}
