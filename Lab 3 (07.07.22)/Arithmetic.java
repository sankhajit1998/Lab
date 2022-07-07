package Lab;
/*
@author Sankhajit Roy
*/
// Q.1 Simple inheritance

class Arithmetic {  // class 1
    public int add(int a, int b){   // add method with 2 parameters
        return (a+b);
    }
}
class Adder extends Arithmetic{    // class 2
    public static void main(String[] args) {  // main method
        Arithmetic obj = new Arithmetic();   // object
        System.out.println("The sum of two integers is "+obj.add(50,20));
    }
}
