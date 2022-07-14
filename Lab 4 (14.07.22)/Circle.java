package com.innovation.shapes;

/*
@author Sankhajit Roy
*/

// area of circle and circumference of circle

public class Circle {       // parent class
	public float radius;
	public float pi = 3.5f;
	
	public Circle(){    // constructor 1
		radius = 1.5f;
	}
	protected Circle(float radius){   // constructor 2
		this.radius = radius;
	}
	protected Circle(float radius, float pi){    // constructor 3
		this(radius);
		this.pi=3.5f;
	}
	
	
	public float calculateCircleArea() {    // method 1
		return pi*radius*radius;    // logic
	}
	public float calculateCircumference() {     // method 2
		return 2*pi*radius;         // logic
	}
	
	public static void main(String[] args) {   // main method
		Circle obj = new Circle();    // object
		System.out.println("Area of cricle is "+obj.calculateCircleArea());
		System.out.println("Circumference of circle is "+obj.calculateCircumference());
	}
}
