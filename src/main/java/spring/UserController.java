package spring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
//	public User login(@RequestParam("email") String email,@RequestParam("pwd") String pwd ){
	public User login(@RequestBody User user){
		System.out.println("Email:"+user.email+","+user.pwd);
		System.out.println("==== in LoginApp ====");
//		return new User(email,pwd);
		return user;
	}
	
	@RequestMapping(value="/submitApp",method=RequestMethod.POST)
	public Application sumitApp(@RequestBody Application app ){
		System.out.println(app.namePI+", "+app.emailPI+" , "+app.departmentPI);
		System.out.println("==== in submitApp ====");
		return app;
	}
}
