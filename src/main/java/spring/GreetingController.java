/*package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
//  @RequestMapping(value="/greeting",method=RequestMethod.GET)
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Ankit") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}*/


package spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping("/greeting")
	public @ResponseBody Greeting greeting(@RequestParam(required=false, defaultValue="Ankit") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	@RequestMapping(value = "/savecompany", method = RequestMethod.POST)
	public  @ResponseBody String saveCompany( @RequestParam("emailPI") String emailPI,
			@RequestParam("projectTitle") long prjTitle,
			@RequestParam("namePI") String namePI) {		
		return "The company data (email: " + emailPI + ", employees: "+ String.valueOf( prjTitle ) + ", PI Name: " + namePI + ") is saved";
	}

}