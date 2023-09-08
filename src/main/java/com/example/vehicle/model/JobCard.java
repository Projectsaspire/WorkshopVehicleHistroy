package com.example.vehicle.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Collection;

@Entity
@Table(name = "jobcard")
public class JobCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jobId;

	@Column(name = "curDate")
	private String curDate;

	@Column(name = "custName")
	private String custName;

	@Column(name = "vName")
	private String vName;

	@Column(name = "vMake")
	private String vMake;

	@Column(name = "phone")
	private String phone;

	@Column(name = "vInventory")
	private String vInventory;

	@Column(name = "sItem")
	private String sItem;

	@Column(name = "cusCompTask")
	private String cusCompTask;

	@Column(name = "frontImg")
	private String frontImg;

	@Column(name = "rhSide")
	private String rhSide;

	@Column(name = "lhSide")
	private String lhSide;

	@Column(name = "rearImg")
	private String rearImg;

	@Column(name = "dashImg")
	private String dashImg;

	@Column(name = "dickyImg")
	private String dickyImg;

	@Column(name = "assignStaff")
	private String assignStaff;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "jobcard_roles",
			joinColumns = @JoinColumn(
		            name = "Job_id", referencedColumnName = "jobId"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;

	public JobCard() { // TODO Auto-generated constructor stub
	}

	public JobCard(Long jobId, String curDate, String custName, String vName, String vMake, String phone,
			String vInventory, String sItem, String cusCompTask, String frontImg, String rhSide, String lhSide,
			String rearImg, String dashImg, String dickyImg, String assignStaff, Collection<Role> roles) {
		super();
		this.jobId = jobId;
		this.curDate = curDate;
		this.custName = custName;
		this.vName = vName;
		this.vMake = vMake;
		this.phone = phone;
		this.vInventory = vInventory;
		this.sItem = sItem;
		this.cusCompTask = cusCompTask;
		this.frontImg = frontImg;
		this.rhSide = rhSide;
		this.lhSide = lhSide;
		this.rearImg = rearImg;
		this.dashImg = dashImg;
		this.dickyImg = dickyImg;
		this.assignStaff = assignStaff;
		this.roles = roles;
	}
	

	public JobCard(Long jobId, String curDate, String custName, String vName, String vMake, String phone,
			String vInventory, String sItem, String cusCompTask, String frontImg, String rhSide, String lhSide,
			String rearImg, String dashImg, String dickyImg, String assignStaff) {
		super();
		this.jobId = jobId;
		this.curDate = curDate;
		this.custName = custName;
		this.vName = vName;
		this.vMake = vMake;
		this.phone = phone;
		this.vInventory = vInventory;
		this.sItem = sItem;
		this.cusCompTask = cusCompTask;
		this.frontImg = frontImg;
		this.rhSide = rhSide;
		this.lhSide = lhSide;
		this.rearImg = rearImg;
		this.dashImg = dashImg;
		this.dickyImg = dickyImg;
		this.assignStaff = assignStaff;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getCurDate() {
		return curDate;
	}

	public void setCurDate(String curDate) {
		this.curDate = curDate;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvMake() {
		return vMake;
	}

	public void setvMake(String vMake) {
		this.vMake = vMake;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getvInventory() {
		return vInventory;
	}

	public void setvInventory(String vInventory) {
		this.vInventory = vInventory;
	}

	public String getsItem() {
		return sItem;
	}

	public void setsItem(String sItem) {
		this.sItem = sItem;
	}

	public String getCusCompTask() {
		return cusCompTask;
	}

	public void setCusCompTask(String cusCompTask) {
		this.cusCompTask = cusCompTask;
	}

	public String getFrontImg() {
		return frontImg;
	}

	public void setFrontImg(String frontImg) {
		this.frontImg = frontImg;
	}

	public String getRhSide() {
		return rhSide;
	}

	public void setRhSide(String rhSide) {
		this.rhSide = rhSide;
	}

	public String getLhSide() {
		return lhSide;
	}

	public void setLhSide(String lhSide) {
		this.lhSide = lhSide;
	}

	public String getRearImg() {
		return rearImg;
	}

	public void setRearImg(String rearImg) {
		this.rearImg = rearImg;
	}

	public String getDashImg() {
		return dashImg;
	}

	public void setDashImg(String dashImg) {
		this.dashImg = dashImg;
	}

	public String getDickyImg() {
		return dickyImg;
	}

	public void setDickyImg(String dickyImg) {
		this.dickyImg = dickyImg;
	}

	public String getAssignStaff() {
		return assignStaff;
	}

	public void setAssignStaff(String assignStaff) {
		this.assignStaff = assignStaff;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	
}
