package edu.services;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "Applicant")
public class Applicant {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicant_id;
	private String nameApplicant;
	private String emailApplicant;
	private String departmentApplicant;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="application_id")
//	private Application application;
	public long getApplicant_id() {
		return applicant_id;
	}
	public void setApplicant_id(long applicant_id) {
		this.applicant_id = applicant_id;
	}
/*	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}*/
	
	public Applicant(){
	}
	public String getNameApplicant() {
		return nameApplicant;
	}
	public void setNameApplicant(String nameApplicant) {
		this.nameApplicant = nameApplicant;
	}
	public String getEmailApplicant() {
		return emailApplicant;
	}
	public void setEmailApplicant(String emailApplicant) {
		this.emailApplicant = emailApplicant;
	}
	public String getDepartmentApplicant() {
		return departmentApplicant;
	}
	public void setDepartmentApplicant(String departmentApplicant) {
		this.departmentApplicant = departmentApplicant;
	}
	
}
