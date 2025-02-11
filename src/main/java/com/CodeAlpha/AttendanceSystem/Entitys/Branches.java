package com.CodeAlpha.AttendanceSystem.Entitys;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Branches {
	@Id
	private int branchId;
	private String branchName;
	
	public Branches() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branches(int branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	@Override
	public String toString() {
		return "Branches [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	

}
