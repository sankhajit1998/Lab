package com.example.daoimpl;
/*
@Author Sankhajit Roy
*/

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.StudentDAO;
import com.example.entity.Student;

public class StudentDaoImpl implements StudentDAO {    // DAO implementation class
	
	@Override
	public void addStudent() {     // method
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		String n,d,e;
		long p;
		// taking user input & read the user input
		System.out.println("Enter Name: ");
		n = sc.nextLine();
		System.out.println("Enter Dept: ");
		d = sc.nextLine();
		System.out.println("Enter Email: ");
		e = sc.nextLine();
		System.out.println("Enter Phone: ");
		p = sc.nextLong();
		// creating a student class object
		Student s = new Student();
		// set values
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		// mapping with entity classes
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchStudent() {        // meythod
		// creating scanner class object
		Scanner s1 = new Scanner(System.in);
		int id;
		// taking user input
		System.out.println("Enter ID: ");
		// reading user input
		id = s1.nextInt();
		// mapping with entity classes
		Session session = HibernateUtil.makeSession();
		Student std = session.get(Student.class, id);
		// fetch the data from selected table
		System.out.println("----------- Student Data -----------");
		System.out.println(std.getName()+" "+std.getDept()+" "+std.getEmail()+" "+std.getPhone());
			
		
	}
}
