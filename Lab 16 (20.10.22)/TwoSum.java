/*
@Author Sankhajit Roy
*/

/* 4. Write a java program to Read array of integers and a target from the user and the return indices of the two numbers such they add up to the target(create a separate method to perform operation)
        example
        expected input: ar=[2,4,6,5,3],target=11;
        expected output:adding [2,3]
*/

public class TwoSum {    // main class
    int arr[]= {2,4,6,5,3};
    int target=11;
    public String sumValue() {   // created a method
        // for loop to get length of array
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if (arr[i]+arr[j]==target) {
                    return i+","+j;     // returning value
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {    // main method
        // created a class object
        TwoSum ts=new TwoSum();
        // print value by calling method
        System.out.println("Adding two index values is ["+ts.sumValue()+"]");

    }
}