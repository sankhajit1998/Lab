/*
@Author Sankhajit Roy 
*/
// if else ladder statement.

package sankha_java;

public class if_else_ladder {

	public static void main(String[] args) {   // main method
		
		String name = "Riya";     // took value
		if(name == "Meena") {           // 1st condition
			System.out.println("name is Meena");
		}
		else if(name == "Neha") {       // 2nd condition
			System.out.println("name is Neha");
		}
		else if(name == "Amit") {       // 3rd condition
			System.out.println("name is Amit");
		}
		else {                          // last condition
			System.out.println(name);
		}

	}

}
