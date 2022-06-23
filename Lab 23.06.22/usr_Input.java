// get input from user
import java.util.Scanner;
class usr_Input{
	public static void main(String[] args){
		Scanner name1 = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name2 = name1.nextLine();
        System.out.println("My name is "+name2);		
	}
}
