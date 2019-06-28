package com.ibm.training.trainings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;








@RestController
public class TrainingController {

	@Autowired
	TrainingService ts;
	
	@RequestMapping("/trainings/{id}")
	String getTraining(@PathVariable int id) {
		return ts.getTraining(id);
	}
	
	@RequestMapping("/trainings")
	List<Training> getTrainings() {
		return ts.getTrainings();

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/trainings")
	void addTraining(@RequestBody Training trainings) {
		ts.addTraining(trainings);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "trainings/{id}")
	void updateTraining(@RequestBody Training trng, @PathVariable Integer id) {
		ts.updateTraining(trng, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "trainings/{id}")
	void deleteTraining(@PathVariable Integer id) {
		ts.deleteTraining(id);
	}
}
