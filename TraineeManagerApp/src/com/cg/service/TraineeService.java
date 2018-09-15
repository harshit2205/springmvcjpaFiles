package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {

	public void addTrainee(Trainee trainee);
	public void deleteTrainee(Integer id);
	public void updateTrainee(Trainee trainee);
	public Trainee retriveTrainee(int id);
	public List<Trainee> retriveTrainees();
}
