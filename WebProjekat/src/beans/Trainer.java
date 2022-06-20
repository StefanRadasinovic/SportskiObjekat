package beans;

import java.util.List;

public class Trainer extends User {
	private List<TrainingHistory> trainingHistory;

	public Trainer(List<TrainingHistory> trainingHistory) {
		super();
		this.trainingHistory = trainingHistory;
	}

	public List<TrainingHistory> getTrainingHistory() {
		return trainingHistory;
	}

	public void setTrainingHistory(List<TrainingHistory> trainingHistory) {
		this.trainingHistory = trainingHistory;
	}
	
	
	
	
	

}
