/*package edu.models;


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
 */



package edu.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.services.Applicant;
import edu.services.Application;
import edu.services.ExperimentalConditions;

@Repository
@Transactional
@Component
public class ApplicationDAO {
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}

	/*	  public void save(ApplicationData applicationdata) {
		  getSession().save(applicationdata);
		  return;
	  }
	 */	  public void save(Application applicationData){//,ExperimentalConditions[] expData,Applicant[] applicantData) {
		 try {
			 System.out.println("app-data : "+applicationData);
			 System.out.println("app_namePI : "+applicationData.getNamePI());
			 //		System.out.println("app_experimental 0 : "+applicationData.getExperimentRow()[0]);
			 //		System.out.println("app_experimental 0 : "+applicationData.getExperimentRow()[0].getLightOff());
			 //		System.out.println("applicant 0 : "+applicationData.getApplicantRow()[0].getEmailApplicant());
			 //		applicationData.getExperimentRow().setApplication(applicationData);
			 /*applicationData.getExperimentRow().get(0).setApplication(applicationData);
		applicationData.getApplicantRow().get(0).setApplication(applicationData);
		getSession().save(applicationData);
		System.out.println("App saved sucessfully inside try");*/
			 for(Applicant rowApp : applicationData.getApplicantRow()){
				 rowApp.setApplication(applicationData);
			 }
			 System.out.println("Applicant save");
			 for(ExperimentalConditions rowExp :applicationData.getExperimentRow()){
				 rowExp.setApplication(applicationData);
			 }
			 System.out.println("Exp save");
			 getSession().save(applicationData);
			 System.out.println("Application save");
			 //		getSession().save(applicationData.getExperimentRow());
			 //		getSession().save("Application",applicationData);
			 /*int i=0;
		while(i<applicationData.getExperimentRow().size()){
		getSession().save(applicationData.getExperimentRow());
		i++;
		}*/
			 //		getSession().save("ExperimentalConditions", applicationData.getExperimentRow()[0]);
			 /*i=0;
		while(i<applicationData.getApplicantRow().length){
		getSession().save(applicationData.getApplicantRow()[i]);
		i++;
		}*/
			 //		getSession().save("Applicant", applicationData.getApplicantRow()[0]);

			 //		getSession().save(applicantData);

			 System.out.println("....app data....");
		 } catch (Exception e) {
			 System.out.println("Error in saving");
			 //			e.printStackTrace();
			 //		  throw new IllegalStateException("A book has a null property", e);
		 }
		 System.out.println("App saved sucessfully");
		 return;
	 }

	 public void delete(Application applicationdata) {
		 getSession().delete(applicationdata);
		 return;
	 }

//	 @JsonIgnore
	 public List<Application> listApps() {
		 //			Session session = sessionFactory.getCurrentSession();
		 List<Application> application = null;
		 try {
			 application = (List<Application>)getSession().createQuery("from Application").list();
//			 System.out.println("======================="+application.get(0).getEmailPI());
//			 System.out.println(application);
//			 System.out.println("-----------------------"+application.get(11).getExperimentRow().get(0).getContainerSize());
			 System.out.println(application.size());
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 return application;
	 }

	 @SuppressWarnings("unchecked")
	 public List<ApplicationData> getAll() {
		 return getSession().createQuery("from ApplicationData").list();
	 }

	 /* public ApplicationData getByEmail(String email) {
	    return (ApplicationData) getSession().createQuery(
	        "from ApplicationData where email = :email")
	        .setParameter("email", email)
	        .uniqueResult();
	  }

	  public ApplicationData getByPhone(String phone) {
		    return (ApplicationData) getSession().createQuery(
		        "from ApplicationData where phone = :phone")
		        .setParameter("phone", phone)
		        .uniqueResult();
		  }
	  */
	 public ApplicationData getById(long id) {
		 return (ApplicationData) getSession().load(ApplicationData.class, id);
	 }

	 /*	  public void update(ApplicationData applicationdata) {
	    getSession().update(applicationdata);
	    return;
	  }*/
}
