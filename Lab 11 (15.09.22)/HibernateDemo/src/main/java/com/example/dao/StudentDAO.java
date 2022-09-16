package com.example.dao;
/*
@Author Sankhajit Roy
*/

public interface StudentDAO {       // DAO class
	
	public void addStudent();       // to add student data into table
	public void deleteStudent();    // to delete student data from table
	public void updateStudent();    // to update student data into table
	public void fetchStudent();    	// to fetch student data into table
}
