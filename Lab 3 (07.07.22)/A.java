package Lab;

/*
@author Sankhajit Roy
*/

// Q.3 This is an example of  Multilevel Inheritance

public class A {   // base class
    void fruit(){    // method 1
        System.out.println("This is Banana.");
    }
}
class B extends A{   // child class 1
    void tree(){   // method 2
        System.out.println("This is a banana tree.");
    }
}
class C extends B{   // child class 2
    void item(){    //  method 3
        System.out.println("This is banana milkshake.");
    }
}
class Main{        // main class
    public static void main(String[] args) {    //  main method
        C obj = new C();   // object
        obj.fruit();   //  called method 1
        obj.tree();    //  called method 2
        obj.item();     // called method 3
    }
}
