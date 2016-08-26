package edu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.models.Patrons;
import edu.models.PatronsDao;



@Controller
@RequestMapping(value="/")
public class PatronsController {
	@Autowired
	  private PatronsDao _patronsDao;
	  
	  @RequestMapping(value="/delete")
	  @ResponseBody
	  public String delete(String email) {
	    try {
	    	Patrons patron = new Patrons(email);
	    	_patronsDao.delete(patron);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "Patron succesfully deleted!";
	  }
	  
	  @RequestMapping(value="/get-by-email")
	  @ResponseBody
	  public String getByEmail(String email) {
	    String userId;
	    String password;
	    String type;
	    try {
	    	Patrons user = _patronsDao.getByEmail(email);
	    	System.out.println("executed statement 1");
	      userId = user.getEmail();
	      password = user.getPwd();
	      type = user.getUser_type();
	    }
	    catch(Exception ex) {
	    	ex.printStackTrace();
	      return "User not found";
	    }
	    return "The user id is: " + userId + " and password is: " + password + " and user type is: "+ type;
	    
	  }

	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(String email, String pwd, String user_type) {
	    try {
	    	System.out.println("hello opening up");
	    	Patrons user = new Patrons(email, pwd, user_type);
	    	System.out.println("created user");
	    	_patronsDao.save(user);
	    	System.out.println("trying to save");
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    
	    return "User succesfully saved!";
	  }
}
