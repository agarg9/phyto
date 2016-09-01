package edu.services;


import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name = "Application")
/*@SecondaryTables({
    @SecondaryTable(name="Applicant", pkJoinColumns={@PrimaryKeyJoinColumn(name = "applicant_id")}),
    @SecondaryTable(name="Experimental_Condition", pkJoinColumns={@PrimaryKeyJoinColumn(name = "experimental_id")})
})*/
//@SecondaryTable(name="Experimental_Condition")
public class Application {
	
//	@Column(table="application_id")
	private long application_id;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getApplication_id() {
		return application_id;
	}
	public void setApplication_id(long application_id) {
		this.application_id = application_id;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	String projectTitle;
	String namePI;
	String emailPI;
	String departmentPI;
	@Temporal(TemporalType.DATE)
	Date startdate;
	@Temporal(TemporalType.DATE)
	Date enddate;
	String substrate;
	String substrateOther;
	String safetyVerify;
	Long commiteeNumber;
	String relation;
	String summary;
	String timeline;
	String revision;
	String affilation;
	Long accountNo;
	String fundSource;
	String otherName;
	String otherEmail;
	String otherStreet;
	String otherCity;
	String otherState;
	String otherZip;
//	@Transient
//	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
	Applicant[] applicantRow;
//	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
//	@Transient
	private List<ExperimentalConditions> experimentRow;
	@OneToMany(targetEntity=ExperimentalConditions.class,mappedBy="application",
			cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<ExperimentalConditions> getExperimentRow() {
		return experimentRow;
	}
	public void setExperimentRow(List<ExperimentalConditions> experimentRow) {
		this.experimentRow = experimentRow;
	}
	String lastModified;
	public Application(){
	}
	public Application(String projectTitle,Date startdate,Date enddate,String lastModified){
		this.projectTitle=projectTitle;
		this.startdate=startdate;
		this.enddate=enddate;
		this.lastModified=lastModified;
	}
//	@Column(table="Experimental_Conditions")
//  @JoinColumn(name = "application_id")
	@Transient
	public Applicant[] getApplicantRow() {
		return applicantRow;
	}
	
	public void setApplicantRow(Applicant[] applicantRow) {
		this.applicantRow = applicantRow;
	}
	
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getNamePI() {
		return namePI;
	}
	public void setNamePI(String namePI) {
		this.namePI = namePI;
	}
	public String getEmailPI() {
		return emailPI;
	}
	public void setEmailPI(String emailPI) {
		this.emailPI = emailPI;
	}
	public String getDepartmentPI() {
		return departmentPI;
	}
	public void setDepartmentPI(String departmentPI) {
		this.departmentPI = departmentPI;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getSubstrate() {
		return substrate;
	}
	public void setSubstrate(String substrate) {
		this.substrate = substrate;
	}
	public String getSubstrateOther() {
		return substrateOther;
	}
	public void setSubstrateOther(String substrateOther) {
		this.substrateOther = substrateOther;
	}
	public String getSafetyVerify() {
		return safetyVerify;
	}
	public void setSafetyVerify(String safetyVerify) {
		this.safetyVerify = safetyVerify;
	}
	public Long getCommiteeNumber() {
		return commiteeNumber;
	}
	public void setCommiteeNumber(Long commiteeNumber) {
		this.commiteeNumber = commiteeNumber;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTimeline() {
		return timeline;
	}
	public void setTimeline(String timeline) {
		this.timeline = timeline;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getAffilation() {
		return affilation;
	}
	public void setAffilation(String affilation) {
		this.affilation = affilation;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getFundSource() {
		return fundSource;
	}
	public void setFundSource(String fundSource) {
		this.fundSource = fundSource;
	}
	public String getOtherName() {
		return otherName;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	public String getOtherEmail() {
		return otherEmail;
	}
	public void setOtherEmail(String otherEmail) {
		this.otherEmail = otherEmail;
	}
	public String getOtherStreet() {
		return otherStreet;
	}
	public void setOtherStreet(String otherStreet) {
		this.otherStreet = otherStreet;
	}
	public String getOtherCity() {
		return otherCity;
	}
	public void setOtherCity(String otherCity) {
		this.otherCity = otherCity;
	}
	public String getOtherState() {
		return otherState;
	}
	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}
	public String getOtherZip() {
		return otherZip;
	}
	public void setOtherZip(String otherZip) {
		this.otherZip = otherZip;
	}
}
//"applicantRow":[{"nameApplicant":"","emailApplicant":"","departmentApplicant":""}],
//"experimentRow":[{"lightOn":"","tempDay":"","lightOff":"","tempNight":"","nightInterrupt":false,"numOfPots":"","containerSize":"","potSpace":"","watering":"","species":""}],
//"":"","":"","":"","":"","":"","":"","":"","":"","":"","":"","":"","":"","":"",
//"":"","":"","":"","":"","":"","":"","":"","":"","":""}]
