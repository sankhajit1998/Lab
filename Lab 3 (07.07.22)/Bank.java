package Lab;

/*
@author Sankhajit Roy
*/
// Q.4 This is an example of Method Overriding

public class Bank {   // base class
    public float getRateOfInterest(){   // method
        return 0;
    }
}
class SBI extends Bank{   // child class 1
    @Override
    public float getRateOfInterest() {    // method
        return 8;
    }
}
class ICICI extends Bank{   // child class 2
    @Override
    public float getRateOfInterest() {    // method
        return 7;
    }
}
class AXIS extends Bank{     // child class 3
    @Override
    public float getRateOfInterest() {    // method
        return 9;
    }
}
class newClass{    //  main class
    public static void main(String[] args) {    // main method
        SBI obj1 = new SBI();        // object 1
        ICICI obj2 = new ICICI();    // object 2
        AXIS obj3 = new AXIS();      // object 3
        System.out.println("Rate of interest in SBI: "+obj1.getRateOfInterest());
        System.out.println("Rate of interest in ICICI: "+obj2.getRateOfInterest());
        System.out.println("Rate of interest in AXIS: "+obj3.getRateOfInterest());
    }
}