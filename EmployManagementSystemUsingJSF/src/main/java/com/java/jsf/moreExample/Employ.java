package com.java.jsf.moreExample;

public class Employ {

	private int empNo;
	private String empFirstName;
	private String empLastName;
	private String gender;
	private String empAddress;
	private int empBasic;
	private double empPremium;
	
	public Employ(int empNo, String empFirstName, String empLastName, String gender, String empAddress, int empBasic,
			double empPremium) {
		super();
		this.empNo = empNo;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.gender = gender;
		this.empAddress = empAddress;
		this.empBasic = empBasic;
		this.empPremium = empPremium;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpBasic() {
		return empBasic;
	}
	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}
	public double getEmpPremium() {
		return empPremium;
	}
	public void setEmpPremium(double empPremium) {
		this.empPremium = empPremium;
	}
	
	
	
	
	
	
	
}
