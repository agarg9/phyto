package edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.models.ApplicationDAO;
import edu.services.Application;

@RestController
public class ApplicationController {
	@Autowired
	private ApplicationDAO applicationDAO;
	
	@RequestMapping(value="/submitApp",method=RequestMethod.POST)
	public Application sumitApp(@RequestBody Application app ){
		app.setType("Submitted");
		try{
			System.out.println("...Submitting...");
			applicationDAO.save(app);//, app.getExperimentRow(),app.getApplicantRow());
		}catch(Exception ex){
//			return ex.getMessage();
		}
		return app;
	}
	@RequestMapping(value="/saveApp",method=RequestMethod.POST)
	public Application saveApp(@RequestBody Application app ){
		app.setType("Saved");
		try{
			System.out.println("...Saving...");
			applicationDAO.save(app);//, app.getExperimentRow(),app.getApplicantRow());
		}catch(Exception ex){
//			return ex.getMessage();
		}
		return app;
	}
	
	@RequestMapping(value="/showSavedAppList",method=RequestMethod.GET)
	public List<Application> listSavedApplications()  {
		List<Application> applicationList = applicationDAO.listSavedApps();
		/*System.out.println("Size of apps: "+applicationList.size());
		System.out.println("Start Date Format: "+applicationList.get(0).getStartdate());
		System.out.println("End Date Format: "+applicationList.get(0).getEnddate());
		System.out.println("Updated time Format: "+applicationList.get(0).getLastModified());
		System.out.println("Value of apps: "+applicationList.get(11).getEmailPI());*/
		return applicationList;
	}
	@RequestMapping(value="/showAllAppList",method=RequestMethod.GET)
	public List listAllApplications()  {
		List applicationList = applicationDAO.listAllApps();
		return applicationList;
	}
	@RequestMapping(value="/showSampAllAppList",method=RequestMethod.GET)
	public List<Application> listSampAllApplications()  {
		List<Application> applicationList = applicationDAO.listSampAllApps();
		return applicationList;
	}
}
