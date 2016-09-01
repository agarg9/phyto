package edu.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sampledata")
public class SpringSample {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	
	private String phone;
	
	private String email;

	private String address;

	public SpringSample() { }

	public SpringSample(long id) { 
	    this.id = id;
	  }

	public SpringSample(String name, String phone, String email, String address) {
	    this.name = name;
	    this.phone = phone;
	    this.email = email;
	    this.address = address;
	  }

	public long getId() {
		return id;
	}

	public void setId(long value) {
		this.id = value;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String value) {
		this.address = value;
	}
}
