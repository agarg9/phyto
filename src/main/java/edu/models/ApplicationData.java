package edu.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "applicationData")
public class ApplicationData implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Id
	@Column(name = "projectTitle")
	private String projectTitle;
	
	@Id
	@Column(name = "emailApplication")
	private String emailApplication;
	
	@Id
	@Column(name = "emailPI")
	private String emailPI;
	
	@Column(name = "departmentApplication")
	private String departmentApplication;
	
	@Column(name = "namePI")
	private String namePI;
	
	@Column(name = "departmentPI")
	private String departmentPI;
	
	@Column(name = "lightOn")
	private String lightOn;
	
	@Column(name = "tempDay")
	private String tempDay;
	
	@Column(name = "lightOff")
	private String lightOff;
	
	@Column(name = "tempNight")
	private String tempNight;
	
	@Column(name = "nightInterrupt")
	private String nightInterrupt;
	
	@Column(name = "numOfPots")
	private String numOfPots;
	
	@Column(name = "containerSize")
	private String containerSize;
	
	@Column(name = "potSpace")
	private String potSpace;
	
	@Column(name = "watering")
	private String watering;
	
	@Column(name = "species")
	private String species;
	
	@Column(name = "startdate")
	private String startdate;
	
	@Column(name = "enddate")
	private String enddate;
	
	@Column(name = "substrate")
	private String substrate;
	
	@Column(name = "substrateOther")
	private String substrateOther;
	
	@Column(name = "safetyVerify")
	private String safetyVerify;
	
	@Column(name = "commiteeNumber")
	private String commiteeNumber;
	
	@Column(name = "relation")
	private String relation;
	
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "timeline")
	private String timeline;
	
	@Column(name = "revision")
	private String revision;
	
	@Column(name = "affiliation")
	private String affiliation;
	
	@Column(name = "accountNo")
	private String accountNo;
	
	@Column(name = "fundSource")
	private String fundSource;
	
	@Column(name = "otherName")
	private String otherName;
	
	@Column(name = "otherEmail")
	private String otherEmail;
	
	@Column(name = "otherStreet")
	private String otherStreet;
	
	@Column(name = "otherCity")
	private String otherCity;
	
	@Column(name = "otherState")
	private String otherState;
	
	@Column(name = "otherZip")
	private String otherZip;
	
	public ApplicationData(){}
	
	public ApplicationData(long id){
		this.id = id;
	}

	public ApplicationData(String projectTitle, String emailApplication, String departmentApplication,
			String namePI, String emailPI, String departmentPI, String lightOn, String tempDay, String lightOff,
			String tempNight, String nightInterrupt, String numOfPots, String containerSize, String potSpace,
			String watering, String species, String startdate, String enddate, String substrate, String substrateOther,
			String safetyVerify, String commiteeNumber, String relation, String summary, String timeline,
			String revision, String affiliation, String accountNo, String fundSource, String otherName,
			String otherEmail, String otherStreet, String otherCity, String otherState, String otherZip) {
		this.projectTitle = projectTitle;
		this.emailApplication = emailApplication;
		this.departmentApplication = departmentApplication;
		this.namePI = namePI;
		this.emailPI = emailPI;
		this.departmentPI = departmentPI;
		this.lightOn = lightOn;
		this.tempDay = tempDay;
		this.lightOff = lightOff;
		this.tempNight = tempNight;
		this.nightInterrupt = nightInterrupt;
		this.numOfPots = numOfPots;
		this.containerSize = containerSize;
		this.potSpace = potSpace;
		this.watering = watering;
		this.species = species;
		this.startdate = startdate;
		this.enddate = enddate;
		this.substrate = substrate;
		this.substrateOther = substrateOther;
		this.safetyVerify = safetyVerify;
		this.commiteeNumber = commiteeNumber;
		this.relation = relation;
		this.summary = summary;
		this.timeline = timeline;
		this.revision = revision;
		this.affiliation = affiliation;
		this.accountNo = accountNo;
		this.fundSource = fundSource;
		this.otherName = otherName;
		this.otherEmail = otherEmail;
		this.otherStreet = otherStreet;
		this.otherCity = otherCity;
		this.otherState = otherState;
		this.otherZip = otherZip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getEmailApplication() {
		return emailApplication;
	}

	public void setEmailApplication(String emailApplication) {
		this.emailApplication = emailApplication;
	}

	public String getDepartmentApplication() {
		return departmentApplication;
	}

	public void setDepartmentApplication(String departmentApplication) {
		this.departmentApplication = departmentApplication;
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

	public String getLightOn() {
		return lightOn;
	}

	public void setLightOn(String lightOn) {
		this.lightOn = lightOn;
	}

	public String getTempDay() {
		return tempDay;
	}

	public void setTempDay(String tempDay) {
		this.tempDay = tempDay;
	}

	public String getLightOff() {
		return lightOff;
	}

	public void setLightOff(String lightOff) {
		this.lightOff = lightOff;
	}

	public String getTempNight() {
		return tempNight;
	}

	public void setTempNight(String tempNight) {
		this.tempNight = tempNight;
	}

	public String getNightInterrupt() {
		return nightInterrupt;
	}

	public void setNightInterrupt(String nightInterrupt) {
		this.nightInterrupt = nightInterrupt;
	}

	public String getNumOfPots() {
		return numOfPots;
	}

	public void setNumOfPots(String numOfPots) {
		this.numOfPots = numOfPots;
	}

	public String getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(String containerSize) {
		this.containerSize = containerSize;
	}

	public String getPotSpace() {
		return potSpace;
	}

	public void setPotSpace(String potSpace) {
		this.potSpace = potSpace;
	}

	public String getWatering() {
		return watering;
	}

	public void setWatering(String watering) {
		this.watering = watering;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
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

	public String getCommiteeNumber() {
		return commiteeNumber;
	}

	public void setCommiteeNumber(String commiteeNumber) {
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

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
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
