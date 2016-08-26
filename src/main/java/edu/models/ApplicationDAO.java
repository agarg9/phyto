package edu.models;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

import edu.services.Application;

@Component
public class ApplicationDAO {
	private static List applications;
	{
	applications=new ArrayList();
	DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	try {
		applications.add(new Application("Sample Project 1",(Date)formatter.parse("2016/04/04"),(Date)formatter.parse("2016/04/04"),"2016/04/04"));
		applications.add(new Application("Sample Project 2",(Date)formatter.parse("2016/03/07"),(Date)formatter.parse("2016/04/04"),"2016/04/04"));
//		applications.add(new Application("Sample Project 2",(Date)formatter.parse("2016-04-04T21:43:40.000Z"),(Date)formatter.parse("2016-04-04T21:43:40.000Z"),"2016-04-04T21:43:40.000Z"));
		applications.add(new Application("Sample Project 3",(Date)formatter.parse("2016/07/07"),(Date)formatter.parse("2016/04/04"),"2016/04/04"));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static List listApplication() {
		return applications;
	}
}
