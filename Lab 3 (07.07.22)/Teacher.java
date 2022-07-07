package Lab;

/*
@author Sankhajit Roy
*/
// Q.2 Inherit the method

public class Teacher {  // base class
    String collegeName = "I.M.P.S College";
    String designation = "Teacher";
    void work(){   // method
        System.out.println("The teacher's details.");
    }

}
class ITTeacher extends Teacher{   // child class
    public static void main(String[] args) {   // main method
        ITTeacher obj = new ITTeacher();   // object
        obj.work();      // call method
        System.out.println("His college name is "+obj.collegeName);
        System.out.println("His designation is "+obj.designation);
    }

}

