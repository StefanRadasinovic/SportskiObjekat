package beans;

import java.awt.Image;
import java.util.List;

import enums.Content;
import enums.SportsObjectStatus;
import enums.SportsObjectType;

public class SportsObject {
	 private String name;
	    private SportsObjectType sportsObjectType;
	    private List<Content> content;
	    private SportsObjectStatus status;
	    private Location location;
	    private Image logo;
	    private double AverageGrade;
	    private double BusinessHours;
	    private boolean deleted;
	    
	    
	    
		public SportsObject(String name, SportsObjectType sportsObjectType, List<Content> content,
				SportsObjectStatus status, Location location, Image logo, double averageGrade, double businessHours) {
			super();
			this.name = name;
			this.sportsObjectType = sportsObjectType;
			this.content = content;
			this.status = status;
			this.location = location;
			this.logo = logo;
			AverageGrade = averageGrade;
			BusinessHours = businessHours;
		}
	    
		 public boolean isDeleted() {
				return deleted;
			}
			public void setDeleted(boolean deleted) {
				this.deleted = deleted;
			}
	    
	    public SportsObject() {}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public SportsObjectType getSportsObjectType() {
			return sportsObjectType;
		}


		public void setSportsObjectType(SportsObjectType sportsObjectType) {
			this.sportsObjectType = sportsObjectType;
		}


		public List<Content> getContent() {
			return content;
		}


		public void setContent(List<Content> content) {
			this.content = content;
		}


		public SportsObjectStatus getStatus() {
			return status;
		}


		public void setStatus(SportsObjectStatus status) {
			this.status = status;
		}


		public Location getLocation() {
			return location;
		}


		public void setLocation(Location location) {
			this.location = location;
		}


		public Image getLogo() {
			return logo;
		}


		public void setLogo(Image logo) {
			this.logo = logo;
		}


		public double getAverageGrade() {
			return AverageGrade;
		}


		public void setAverageGrade(double averageGrade) {
			AverageGrade = averageGrade;
		}


		public double getBusinessHours() {
			return BusinessHours;
		}


		public void setBusinessHours(double businessHours) {
			BusinessHours = businessHours;
		}
	    
	    
	    
	    
	    
	    
	    
	    
	
}
