package com.CodeAlpha.AttendanceSystem.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String className;
	private boolean attendence;
	@ManyToOne
    @JoinColumn(name = "branch_id")
    private Branches branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String className, boolean attendence, Branches branch) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.attendence = attendence;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public boolean isAttendence() {
		return attendence;
	}
	public void setAttendence(boolean attendence) {
		this.attendence = attendence;
	}
	public Branches getBranch() {
		return branch;
	}
	public void setBranch(Branches branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", attendence=" + attendence
				+ ", branch=" + branch + "]";
	}
	
	
	
	

}
