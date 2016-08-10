package spring;

import java.util.Date;

public class Application {
	String projectTitle;
	String namePI;
	String emailPI;
	String departmentPI;
	Date startdate;
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
	Applicant[] applicantRow;
	ExperimentalConditions[] experimentRow;
	public ExperimentalConditions[] getExperimentRow() {
		return experimentRow;
	}
	public void setExperimentRow(ExperimentalConditions[] experimentRow) {
		this.experimentRow = experimentRow;
	}
	public Applicant[] getApplicantRow() {
		return applicantRow;
	}
	public void setApplicantRow(Applicant[] applicantRow) {
		this.applicantRow = applicantRow;
	}
	public Application(){
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
