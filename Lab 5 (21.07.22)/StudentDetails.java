package Lab5;

/*
@author Sankhajit Roy
*/

/*
Q.4  Create a student class having the following attributes
              1. Student No. (Data type int)
              2. Student Name. (Data type String)
              3. Student Mail Id. (Data type String)
              4. Student Address. (Data type String)
         This class should have 2 methods
              1. void fees (Int Student No.)
              2. void display (Int Student number)
              
•	After the class, you need to create an array of Student having 5 Students
    assign different fees to each Student and also print the details of each
    Student with the array only.


•	Now create a static method in the main class which will accept Student 
    number and Student fees as parameter and if the fees are less than 2000
    then fees will increase by 10% of their current fees to that Student.

•	Call the display method to print the updated details.

*/

public class StudentDetails {   // super class
	int Student_No,Student_Fees;
	String Student_Name,Student_Email,Student_Address;
	
	public StudentDetails(int num,String name,String email,String address) {  // parameterized constructor
		this.Student_No = num;
		this.Student_Name = name;
		this.Student_Email = email;
		this.Student_Address = address;
	}
	
	public void studentFees(int fees) {   // method to calculate student fees 
		if(fees <= 2000) {
			fees += 10*fees/100;    // logic to increase 10% for student fees below 2000
		}
		this.Student_Fees = fees;
	}
	public void display() {   // method to display all elements
		System.out.println("Student No.: "+Student_No+", Student Name: "+Student_Name+", Student Email: "+Student_Email+", Student Address: "+Student_Address+", Student Fees: "+Student_Fees);
	}
	
}
class Student{    // sub class
	public static void main(String[] args) {    // main method
		StudentDetails arr[] = new StudentDetails[5];   // declaring & initialization of values
		
		// input all student details
		arr[0] = new StudentDetails(165, "Sankhajit", "sankha@mail", "Cooch Behar");
		arr[1] = new StudentDetails(166, "Sayan", "sayan@mail", "Malda");
		arr[2] = new StudentDetails(167, "Adi", "adi@mail", "Malda");
		arr[3] = new StudentDetails(168, "Rajib", "rajib@mail", "Siliguri");
		arr[4] = new StudentDetails(169, "Chinmoy", "chimoy@mail", "Kolkata");
		
		// input student fees details
		arr[0].studentFees(2000);
		arr[1].studentFees(3500);
		arr[2].studentFees(1500);
		arr[3].studentFees(3000);
		arr[4].studentFees(2500);
		
		for(StudentDetails i: arr) {    // for each loop to check all elements
			i.display();    // called the method
		}	
	}
	
}
