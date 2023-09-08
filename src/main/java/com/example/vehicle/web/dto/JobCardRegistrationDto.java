package com.example.vehicle.web.dto;

public class JobCardRegistrationDto {
	
	private Long jobId;
	private String curDate;
	private String custName;
	private String vName;
	private String vMake;
	private String phone;
	private String vInventory;
	private String sItem;
	private String cusCompTask;
	private String frontImg;
	private String rhSide;
	private String lhSide;
	private String rearImg;
	private String dashImg;
	private String dickyImg;
	private String assignStaff;

	
	public JobCardRegistrationDto() {
		// TODO Auto-generated constructor stub
	}

	
	public JobCardRegistrationDto(Long jobId, String curDate, String custName, String vName, String vMake, String phone,
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



	
	

}
