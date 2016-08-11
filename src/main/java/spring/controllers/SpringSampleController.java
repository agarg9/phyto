package spring.controllers;

import spring.models.SpringSample;
import spring.models.SpringSampleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
	    try {
	    	SpringSample user = _springSampleDao.getByEmail(email);
	      userId = String.valueOf(user.getId());
	    }
	    catch(Exception ex) {
	      return "User not found";
	    }
	    return "The user id is: " + userId;
	  }

	  @RequestMapping(value="/save")
	  @ResponseBody
	  public String create(String name, String phone, String email, String address) {
	    try {
	    	System.out.println("hello opening up");
	    	SpringSample user = new SpringSample(name, phone, email, address);
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
