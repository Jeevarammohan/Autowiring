package com.shrishti.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {

	private Integer departmentId;
	private String departmentName;
	private String departmentHead;

	public Integer getDepartmentId() {
		return departmentId;
	}

	@Value("${student.department.deptId}")
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Value("${student.deptName}")
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	@Value("${student.deptHead}")
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentHead="
				+ departmentHead + "]";
	}

}
