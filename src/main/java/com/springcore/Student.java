package com.springcore;

public class Student {
	private int studentId ;
	private String studentName ;
	private String studentAddress ;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentAddress() {
		return studentAddress;
	}
	public void setstudentAddress(String studentaddress) {
		studentAddress = studentaddress;
	}
	public Student(int studentId, String studentName, String studentAdddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	 public Student ()
	 {
		 super();
	 }
	 
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
}
