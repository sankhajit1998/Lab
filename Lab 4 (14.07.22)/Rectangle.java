package com.innovation.shapes;

/*
@author Sankhajit Roy
*/

// area of rectangle 

public class Rectangle {    // parent class
	private int length;
	private int breadth;
	
	Rectangle(int length, int breadth){   // constructor
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength(int length) {      // getter method
		return length;
	}
	public void setLength(int length) {     // setter method    
		this.length = length;
	}
	public int getBreadth(int breadth) {    // getter method
		return breadth;
	}
	public void setBreadth(int breadth) {   // setter method 
		this.breadth = breadth;
	}
	void calculateArea() {                  // method
		System.out.println(length*breadth);
	}
}
class RectangleTest{    // main class
	public static void main(String[] args) {    // main method
		Rectangle obj = new Rectangle(80,10);    // object
		System.out.print("Area = ");
		obj.calculateArea();        // called method
		obj.setLength(90);          // called setter method
		obj.setBreadth(10);         // called setter method
		System.out.print("New Area = ");
		obj.calculateArea();        // called method
	}
}
