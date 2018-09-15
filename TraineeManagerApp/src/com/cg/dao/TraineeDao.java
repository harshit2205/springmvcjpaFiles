package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeDao {

	public void addTrainee(Trainee trainee);
	public void deleteTrainee(Integer id);
	public void updateTrainee(Trainee trainee);
	public Trainee retriveTrainee(int id);
	public List<Trainee> retriveTrainees();
}
