package beans;

import java.awt.Image;

import enums.TrainingType;

public class Training {
	
   private String name;
   private TrainingType trainingType;
   private SportsObject sportsObject;
   private double DurationMinutes;
   private Trainer trainer;
   private String description;
   private Image image;
   private boolean deleted;
   
   
   
   
public Training(String name, TrainingType trainingType, SportsObject sportsObject, double durationMinutes,
		Trainer trainer, String description, Image image) {
	super();
	this.name = name;
	this.trainingType = trainingType;
	this.sportsObject = sportsObject;
	DurationMinutes = durationMinutes;
	this.trainer = trainer;
	this.description = description;
	this.image = image;
	this.deleted = false;
}

public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

   
public Training() {}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public TrainingType getTrainingType() {
	return trainingType;
}

public void setTrainingType(TrainingType trainingType) {
	this.trainingType = trainingType;
}

public SportsObject getSportsObject() {
	return sportsObject;
}

public void setSportsObject(SportsObject sportsObject) {
	this.sportsObject = sportsObject;
}

public double getDurationMinutes() {
	return DurationMinutes;
}

public void setDurationMinutes(double durationMinutes) {
	DurationMinutes = durationMinutes;
}

public Trainer getTrainer() {
	return trainer;
}

public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Image getImage() {
	return image;
}

public void setImage(Image image) {
	this.image = image;
}
   
   
   
   
	

}
