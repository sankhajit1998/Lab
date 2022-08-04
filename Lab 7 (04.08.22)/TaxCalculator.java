package Lab_7;
/*
@Author Sankhajit Roy
*/

// Question 1.

// CountryNotValidException class
class CountryNotValidException extends RuntimeException{   
	public CountryNotValidException(String string, RuntimeException runtimeException) {
		System.out.println("The employee should be an Indian citizen for calculating tax");
	}
}
// EmployeeNameInvalidException class
class EmployeeNameInvalidException extends RuntimeException{
	public EmployeeNameInvalidException(String string, RuntimeException runtimeException) {
		System.out.println("The employee name cannot be empty");
	}
}
// TaxNotEligibleException class
class TaxNotEligibleException extends RuntimeException{
	public TaxNotEligibleException(String string, RuntimeException runtimeException) {
		System.out.println("The employee does not need to pay tax");
	}
}
public class TaxCalculator {    // parent class
	String empName;
	boolean isIndian;
	double empSal;
	// method to calculate tax
	void calculateTax(String empName,boolean isIndian,double empSal) {
		// try block with condition logic
		try {
			if (empSal>100000 && isIndian) {
				System.out.println(empSal * 8/100);
			}
			else if (empSal>100000 && empSal>50000 &&  isIndian) {
				System.out.println(empSal * 6/100);
			}
			else if (empSal>50000 && empSal>30000 &&  isIndian) {
				System.out.println(empSal * 5/100);
			}
			else if (empSal>30000 && empSal>10000 &&  isIndian) {
				System.out.println(empSal * 4/100);
			}
		}
		// finally block to pass all exceptions with conditions
		finally{
			if(!isIndian) {
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax", new RuntimeException());
			}
			if(empName == null) {
				throw new EmployeeNameInvalidException("The employee name cannot be empty",new RuntimeException());
			}
			if (empSal<30000) {
				throw new TaxNotEligibleException("The employee does not need to pay tax", new RuntimeException());
			}
		}
	}
	
}
// main class
class CalculatorSimulator{ 
	// main method throws the all exceptions
	 public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		 TaxCalculator temp = new TaxCalculator();   // object
		 System.out.print("The tax amount is ");
		 // called the calculateTax method with values.
		 temp.calculateTax("Ron", false, 34000);  
		 temp.calculateTax("Tim", true, 1000);
		 temp.calculateTax("Jack", true, 55000);
		 temp.calculateTax(null, true, 30000);
	}
 }