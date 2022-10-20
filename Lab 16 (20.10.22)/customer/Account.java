package customer;
/*
@Author Sankhajit Roy
*/

/*1. Create a class with customer
		=> 3 private instance variables as accountNumber,accountName,accountBalance
        => 3 methods 1. create account => accnumber,accname,accbal
        2. setAmount=> add amount to accbal
        4. withDrawAmount()=to withdraw amount from accBalance
        3. getAmount=>print accbal and name of account
        create a main class to use customer and create atleast two customers */

import java.util.Scanner;

class Account{
    // taking private instance variables
    private long accountNumber;
    private String accountName;
    private double accountBalance;

// =============================================================

    Scanner sc = new Scanner(System.in);

    // method to create account
    public void createAccount() {
        System.out.print("Enter Account No: ");
        accountNumber = sc.nextLong();
        System.out.print("Enter Account Name: ");
        accountName = sc.next();
        System.out.print("Enter Account Balance: ");
        accountBalance = sc.nextDouble();
    }
    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + accountName);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Balance: " + accountBalance);
    }

    // method to deposit amount
    public void depositAmount() {
        double depo;
        System.out.println("Enter the amount you want to deposit: ");
        depo = sc.nextDouble();
        accountBalance = accountBalance + depo;
        System.out.println("Your balance after deposit: " + accountBalance);
    }
    // method to withdraw amount
    public void withdrawAmount() {
        long withdraw;
        System.out.println("Enter the amount you want to withdraw: ");
        withdraw = sc.nextLong();
        if (accountBalance >= withdraw) {
            accountBalance = accountBalance - withdraw;
            System.out.println("Balance after withdrawal: " + accountBalance);
        } else {
            System.out.println("Your balance is less than " + withdraw + "\tTransaction failed...!!" );
        }
    }

    //method to search an account number
    public boolean search(long ac_no) {
        if (accountNumber == ac_no) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
