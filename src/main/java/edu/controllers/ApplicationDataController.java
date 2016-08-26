package edu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.models.ApplicationData;
import edu.models.ApplicationDataDao;


@Controller
@RequestMapping(value="/applicationData")
public class ApplicationDataController {
	@Autowired
	  private ApplicationDataDao _applicationDataDao;
	  
	  @RequestMapping(value="/delete")
	  @ResponseBody
	  public String delete(long id) {
	    try {
	    	ApplicationData appData = new ApplicationData(id);
	    	_applicationDataDao.delete(appData);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Application succesfully deleted!";
	  }
	  
	 /* @RequestMapping(value="/get-by-email")
	  @ResponseBody
	  public String getByEmail(String email) {
	    String userId;
	    String name;
	    try {
	    	SpringSample user = _springSampleDao.getByEmail(email);
	      userId = String.valueOf(user.getId());
	      name = user.getName();
	    }
	    catch(Exception ex) {
	    	ex.printStackTrace();
	      return "User not found 123";
	    }
	    return "The user id is: " + userId + " and name is: "+ name;
	  }*/
	  
	  @RequestMapping(value="/get-by-id")
	  @ResponseBody
	  public String getById(long id) {
		  String projectTitle; String emailApplication; String departmentApplication;
			String namePI; String emailPI; String departmentPI; String lightOn; String tempDay; String lightOff;
			String tempNight; String nightInterrupt; String numOfPots; String containerSize; String potSpace;
			String watering; String species; String startdate; String enddate; String substrate; String substrateOther;
			String safetyVerify; String commiteeNumber; String relation; String summary; String timeline;
			String revision; String affiliation; String accountNo; String fundSource; String otherName;
			String otherEmail; String otherStreet; String otherCity; String otherState; String otherZip;
	    try {
	    	ApplicationData application = _applicationDataDao.getById(id);
	    	projectTitle =application.getProjectTitle();
	    	emailApplication = application.getEmailApplication();
	    	departmentApplication= application.getDepartmentApplication();
			 namePI= application.getNamePI();
			 emailPI= application.getEmailPI();
			 departmentPI= application.getDepartmentPI();
			 lightOn= application.getLightOn();  
			 tempDay= application.getTempDay();  
			 lightOff = application.getLightOff();
			 tempNight = application.getTempNight();  
			 nightInterrupt = application.getNightInterrupt();  
			 numOfPots = application.getNumOfPots();  
			 containerSize = application.getContainerSize();  
			 potSpace = application.getPotSpace();
			 watering = application.getWatering();  
			 species = application.getSpecies();  
			 startdate = application.getStartdate();  
			 enddate = application.getEnddate();  
			 substrate = application.getSubstrate();  
			 substrateOther = application.getSubstrateOther();
			 safetyVerify = application.getSafetyVerify();  
			 commiteeNumber = application.getCommiteeNumber();  
			 relation = application.getRelation();  
			 summary = application.getSummary();  
			 timeline = application.getTimeline();
			 revision = application.getRevision();  
			 affiliation = application.getAffiliation();  
			 accountNo = application.getAccountNo();  
			 fundSource = application.getFundSource();  
			 otherName = application.getOtherName();
			 otherEmail = application.getOtherEmail();
			 otherStreet = application.getOtherStreet();  
			 otherCity = application.getOtherCity(); 
			 otherState = application.getOtherState();  
			 otherZip = application.getOtherZip();
	    	
	    }
	    catch(Exception ex) {
	    	ex.printStackTrace();
	      return "application not found 123";
	    }
	    return "Project Title is: "+ projectTitle + "email app is: "+emailApplication;
	  }
	  
	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(String projectTitle, String emailApplication, String departmentApplication,
				String namePI, String emailPI, String departmentPI, String lightOn, String tempDay, String lightOff,
				String tempNight, String nightInterrupt, String numOfPots, String containerSize, String potSpace,
				String watering, String species, String startdate, String enddate, String substrate, String substrateOther,
				String safetyVerify, String commiteeNumber, String relation, String summary, String timeline,
				String revision, String affiliation, String accountNo, String fundSource, String otherName,
				String otherEmail, String otherStreet, String otherCity, String otherState, String otherZip) {
	    try {
	    	//System.out.println("hello opening up");
	    	
	    	ApplicationData user = new ApplicationData( projectTitle,  emailApplication,  departmentApplication,
					 namePI,  emailPI,  departmentPI,  lightOn,  tempDay,  lightOff,
					 tempNight,  nightInterrupt,  numOfPots,  containerSize,  potSpace,
					 watering,  species,  startdate,  enddate,  substrate,  substrateOther,
					 safetyVerify,  commiteeNumber,  relation,  summary,  timeline,
					 revision,  affiliation,  accountNo,  fundSource,  otherName,
					 otherEmail,  otherStreet,  otherCity,  otherState,  otherZip);
	    	//System.out.println("created user");
	    	_applicationDataDao.save(user);
	    	//System.out.println("trying to save");
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    
	    return "Application succesfully saved!";
	  }

	public ApplicationDataController() {
		super();
	}

	public ApplicationDataController(ApplicationDataDao _applicationDataDao) {
		super();
		this._applicationDataDao = _applicationDataDao;
	}
}
