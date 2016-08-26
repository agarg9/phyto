package edu.models;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class PatronsDao {
	@Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }

	  public void save(Patrons patrons) {
	    getSession().save(patrons);
	    return;
	  }
	  
	  public void delete(Patrons patrons) {
	    getSession().delete(patrons);
	    return;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Patrons> getAll() {
	    return getSession().createQuery("from Patrons").list();
	  }
	  
	  public Patrons getByEmail(String email) {
	    return (Patrons) getSession().createQuery(
	        "from Patrons where email = :email")
	        .setParameter("email", email)
	        .uniqueResult();
	  }
	 /* public Patrons getByEmail(String email) {
		  	System.out.println("here to get data");
		    return (Patrons) getSession().load(Patrons.class, email);
		  }*/
	  
	  public void update(Patrons patron) {
	    getSession().update(patron);
	    return;
	  }
}

