package edu.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ApplicationDataDao {
	@Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }

/*	  public void save(ApplicationData applicationdata) {
		  getSession().save(applicationdata);
		  return;
	  }
*/	  public void save(ApplicationData applicationdata) {
	    getSession().save(applicationdata);
	    return;
	  }
	  
	  public void delete(ApplicationData applicationdata) {
	    getSession().delete(applicationdata);
	    return;
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
