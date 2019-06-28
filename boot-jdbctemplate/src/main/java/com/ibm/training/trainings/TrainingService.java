package com.ibm.training.trainings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TrainingService {
	
	@Autowired
	TrainingDao dao;
	
	
	String getTraining(int id) {
		return dao.getTraining(id);
	}


	public List<Training> getTrainings() {
		return dao.getTrainings();
	}


	public void addTraining(Training trainings) {
		 dao.addTraining(trainings);
		
	}


	public void updateTraining(Training trng, Integer id) {
		dao.updateTraining(trng,id);
		
	}


	public void deleteTraining(Integer id) {
		dao.deleteTraining(id);
		
	}
}
