/*
@Author Sankhajit Roy 
*/
// nested if statement.

package sankha_java;

public class nested_if {   

	public static void main(String[] args) {   // main method
		String address = "Kolkata, India";    // took value
		
		if(address.endsWith("India")) {     // main if statement
			if(address.contains("Dunlop")) {   // nested if statement
				System.out.println("Your city is Dunlop");
			}
			else if(address.contains("Newtown")) {
				System.out.println("Your city is Newtown");
			}
			else {
				System.out.println("Your are not living in India.");
			}
		}

	}

}
