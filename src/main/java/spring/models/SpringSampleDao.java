package spring.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

@Rollback(value = false)
@Repository
@Transactional
public class SpringSampleDao {
	@Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }

	  public void save(SpringSample springsample) {
		  System.out.println("reached save point");
	    getSession().save(springsample);
	    return;
	  }
	  
	  public void delete(SpringSample springsample) {
	    getSession().delete(springsample);
	    return;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<SpringSample> getAll() {
	    return getSession().createQuery("from SpringSample").list();
	  }
	  
	  public SpringSample getByEmail(String email) {
	    return (SpringSample) getSession().createQuery(
	        "from SpringSample where email = :email")
	        .setParameter("email", email)
	        .uniqueResult();
	  }
	  
	  public SpringSample getByPhone(String phone) {
		    return (SpringSample) getSession().createQuery(
		        "from SpringSample where phone = :phone")
		        .setParameter("phone", phone)
		        .uniqueResult();
		  }

	  public SpringSample getById(long id) {
	    return (SpringSample) getSession().load(SpringSample.class, id);
	  }

	  public void update(SpringSample springsample) {
	    getSession().update(springsample);
	    return;
	  }
}
