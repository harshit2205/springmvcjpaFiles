package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cg.dao.TraineeDao;
import com.cg.entities.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao tdao;
	
	@Override
	public void addTrainee(Trainee trainee) {
		tdao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(Integer id) {
		tdao.deleteTrainee(id);
		
	}

	@Override
	public void updateTrainee(Trainee trainee) {
		tdao.updateTrainee(trainee);
		
	}

	@Override
	public Trainee retriveTrainee(int id) {
		return tdao.retriveTrainee(id);
	}

	@Override
	public List<Trainee> retriveTrainees() {
		return null;
	}

}
