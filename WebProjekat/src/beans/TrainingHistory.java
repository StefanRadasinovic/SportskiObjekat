package beans;

import java.util.Date;
import java.util.List;

public class TrainingHistory {
	private Date logInDateAndTime;
	private List<Training> training;
	private Buyer buyer;
	private Trainer trainer;
	
	
	
	public Date getLogInDateAndTime() {
		return logInDateAndTime;
	}
	public void setLogInDateAndTime(Date logInDateAndTime) {
		this.logInDateAndTime = logInDateAndTime;
	}
	public List<Training> getTraining() {
		return training;
	}
	public void setTraining(List<Training> training) {
		this.training = training;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public TrainingHistory(Date logInDateAndTime, List<Training> training, Buyer buyer, Trainer trainer) {
		super();
		this.logInDateAndTime = logInDateAndTime;
		this.training = training;
		this.buyer = buyer;
		this.trainer = trainer;
	}
	
	
	
	public TrainingHistory() {}
	
	
	
	

}
