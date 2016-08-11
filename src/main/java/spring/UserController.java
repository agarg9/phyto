package spring;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private ApplicationDAO applicationDAO;

	
	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
//	public User login(@RequestParam("email") String email,@RequestParam("pwd") String pwd ){
	public User login(@RequestBody User user){
		System.out.println("Email:"+user.email+","+user.pwd);
		System.out.println("==== in LoginApp ====");
		return user;
	}
	@RequestMapping(value="/submitApp",method=RequestMethod.POST)
	public Application sumitApp(@RequestBody Application app ){
		System.out.println(app.namePI+", "+app.emailPI+" , "+app.departmentPI);
		System.out.println("==== in submitApp ====");
		return app;
	}
	@RequestMapping(value="/applicationList",method=RequestMethod.GET)
	public List getApplications() {
		System.out.println("=== In Application List ===");
		System.out.println("List: "+ApplicationDAO.listApplication());
		return applicationDAO.listApplication();
	}
	@RequestMapping(value="/justtochecks",method=RequestMethod.GET)
	public String abcd() {
		System.out.println("=== In justtocheck List ===");
		return "sample";
	}
}