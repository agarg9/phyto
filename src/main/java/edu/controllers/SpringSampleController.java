package edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.models.SpringSample;
import edu.models.SpringSampleDao;


@Controller
@RequestMapping(value="/sampleData")
public class SpringSampleController {
	@Autowired
	  private SpringSampleDao _springSampleDao;
	  
	  @RequestMapping(value="/delete")
	  @ResponseBody
	  public String delete(long id) {
	    try {
	    	SpringSample springsample = new SpringSample(id);
	    	_springSampleDao.delete(springsample);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "User succesfully deleted!";
	  }
	  
	  @RequestMapping(value="/get-by-email")
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
	  }

	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(SpringSample user) {
	    try {
	    	System.out.println("hello opening up");
//	    	SpringSample user = new SpringSample(name, phone, email, address);
	    	System.out.println("created user");
	    	_springSampleDao.save(user);
	    	System.out.println("trying to save");
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    
	    return "User succesfully saved!";
	  }

}
