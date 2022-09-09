/*
@Author Sankhajit Roy
*/
package com.lab1;

public class Employee {  // class
	// taking variables
	private int employee_Id;
	private String employee_Name;
	private String employee_Address;
	private double employee_Salary;
	private long employee_Contact_No;
	private int department_id;
	
	// using getter & setter method
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Address() {
		return employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		this.employee_Address = employee_Address;
	}
	public double getEmployee_Salary() {
		return employee_Salary;
	}
	public void setEmployee_Salary(double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}
	public long getEmployee_Contact_No() {
		return employee_Contact_No;
	}
	public void setEmployee_Contact_No(long employee_Contact_No) {
		this.employee_Contact_No = employee_Contact_No;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
}
