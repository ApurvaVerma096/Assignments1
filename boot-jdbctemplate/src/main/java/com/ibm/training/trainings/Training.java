package com.ibm.training.trainings;

public class Training {

	int trainingId,AvailableSeats;
	String trainingName;
	public Training(int trainingId, int availableSeats, String trainingName) {
		
		this.trainingId = trainingId;
		this.AvailableSeats = availableSeats;
		this.trainingName = trainingName;
	}
	
	public Training() {
		
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public int getAvailableSeats() {
		return AvailableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		AvailableSeats = availableSeats;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	
	
}
