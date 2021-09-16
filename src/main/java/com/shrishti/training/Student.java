package com.shrishti.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:application.properties")
@Component
public class Student {
	private Integer studentId;
	private String studentName;
	private String city;
	@Autowired
	private Department department;

	public Integer getStudentId() {
		return studentId;
	}

	@Value("${student.studId}")
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Value("${student.studName}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	@Value("${student.city}")
	public void setCity(String city) {
		this.city = city;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + ", department="
				+ department + "]";
	}

}
