package edu.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.models.*;
import edu.services.*;

@RestController
public class UserController {
	@Autowired
	private ApplicationDAO applicationDAO;
	@Autowired
	private SpringSampleDao samp;
//	@Autowired
//	private ApplicationDao appDAO;
	
	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
//	public User login(@RequestParam("email") String email,@RequestParam("pwd") String pwd ){
	public User login(@RequestBody User user){
		System.out.println("Email:"+user.getEmail()+","+user.getPwd());
		System.out.println("==== in LoginApp ====");
		return user;
	}
	@RequestMapping(value="/submitApp",method=RequestMethod.POST)
	public Application sumitApp(@RequestBody Application app ){
		System.out.println(app.getNamePI()+", "+app.getEmailPI()+" , "+app.getDepartmentPI());
		System.out.println("==== in submitApp ====");
		try{
			System.out.println("......");
			applicationDAO.save(app);//, app.getExperimentRow(),app.getApplicantRow());
		}catch(Exception ex){
//			return ex.getMessage();
		}
		return app;
	}
	/*@RequestMapping(value="/applicationList",method=RequestMethod.GET)
	public List getApplications() {
		System.out.println("=== In Application List ===");
		System.out.println("List: "+ApplicationDAO.listApplication());
		return applicationDAO.listApplication();
	}*/
	@RequestMapping(value="/justtochecks",method=RequestMethod.GET)
	public String abcd() {
		System.out.println("=== In justtocheck List ===");
		return "sample";
	}
	
	@RequestMapping(value="/saveSampleForm",method=RequestMethod.POST)
	public SpringSample sampleTest(@RequestBody SpringSample user){
		try{
			System.out.println("......");
			samp.save(user);
		}catch(Exception ex){
//			return ex.getMessage();
		}
		return user;
	}
	/* @RequestMapping(value = "/user/", method = RequestMethod.GET)
	    public List<User> listAllApps() {
	        List<User> users = userService.findAllUsers();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }*/
}