package spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "patrons")
public class Patrons {
	@Id
	@Size(min = 2, max = 80)
	//@Column(name = "email", nullable = false)
	private String email;
	
	@Size(min = 2, max = 80)
	//@Column(name = "pwd")
	private String pwd;
	
	@Size(min = 2, max = 80)
	//@Column(name = "user_type")
	private String user_type;
	
	public Patrons(){}
	
	public Patrons(String email) { 
	    this.email = email;
	  }
	public Patrons(String email, String pwd, String user_type){
		this.email=email;
		this.pwd = pwd;
		this.user_type = user_type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String value) {
		this.pwd = value;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String value) {
		this.user_type = value;
	}
	
}
