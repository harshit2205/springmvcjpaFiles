package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;


@Controller
@PropertySource("classpath:/admininfo.properties")
public class TraineeController {
	
	static Integer SHOW_WHOLE_VIEW = 1;
	static Integer SHOW_PAR_VIEW = 2;
	
	@Autowired
	TraineeService tService;
	
	@Value("harshit123")
	String adminname;
	
	@Value("123")
	String adminpassword;
	

	@RequestMapping("dashboard")
	public String showHome(@RequestParam("username")String username, 
						   @RequestParam("password")String password,
						   Model model){
		
		System.out.println("\n\n\n\n\n\n\n\n\n the username and password are "
				+ adminname+", "+adminpassword+"\n\n\n\n\n\n\n\n\n\n\n\n");
		if(username.equals(adminname) && password.equals(adminpassword)){
			
			return "Home.jsp";
		}else{
			return "Login.html";
		}	
	}
	
	@RequestMapping("traineeManager")
	public String manageTrainee(@RequestParam("choice")Integer choice, Model model){
		
		Trainee trainee = new Trainee();
		List<Trainee> trainees = new ArrayList<>();
		Integer view_mode ;
		
		
		switch(choice){
		case 1: model.addAttribute("trainee", trainee);
			return "insertTrainee.jsp";
		case 2: model.addAttribute("trainee",trainee);
			view_mode = SHOW_PAR_VIEW;
			model.addAttribute("view_mode",view_mode);
			return "deleteTrainee.jsp";
		case 3: model.addAttribute("trainee",trainee);
				view_mode = SHOW_PAR_VIEW;
				model.addAttribute("view_mode",view_mode);
			return "modifyTrainee.jsp";
		case 4: model.addAttribute("trainee",trainee);
		    return "findTrainee.jsp";
		case 5: 
			return "findAllTrainee.jsp";
		default: return "Home.jsp";
		}
	}
	
	@RequestMapping("inserttrainee.obj")
	public String insertTrainee(@Valid @ModelAttribute("trainee")Trainee trainee,
			BindingResult res, Model model){
		if(res.hasErrors()){
			model.addAttribute("trainee",trainee);
			return "insertTrainee.jsp";
		}else{
			tService.addTrainee(trainee);
			return null;
		}
		
		
	}
	
	@RequestMapping("deletetrainee")
	public String deletetrainee(@ModelAttribute("trainee")Trainee trainee, Model model){
		Trainee tr = tService.retriveTrainee(trainee.getId());
		model.addAttribute("view_mode",SHOW_WHOLE_VIEW);
		model.addAttribute("trainee", tr);
		return "deleteTrainee.jsp";
	}
	
	@RequestMapping("finaldelete")
	public String finaldelete(@ModelAttribute("trainee")Trainee trainee, Model model){
		System.out.println("\n\n\n\n\n"+trainee.getId()+"\n\n\n\n\n");
		tService.deleteTrainee(trainee.getId());
		return null;
	}
	
	@RequestMapping("retriveTrainee")
	public String retriveTrainee(@ModelAttribute("trainee")Trainee trainee, Model model){
		Integer view_mode = SHOW_WHOLE_VIEW;
		model.addAttribute("view_mode",view_mode);
		trainee = tService.retriveTrainee(trainee.getId());
		System.out.println(trainee);
		model.addAttribute("trainee",trainee);
		return "modifyTrainee.jsp";
	}
	
	@RequestMapping("updateTrainee")
	public String updatetrainee(@ModelAttribute("trainee")Trainee trainee, Model model){
		tService.updateTrainee(trainee);
		return null;
	}
	
}
