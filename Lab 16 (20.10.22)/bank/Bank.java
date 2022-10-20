package bank;
/*
@Author Sankhajit Roy
*/

import java.util.Scanner;

// main class
public class Bank {
    // main method
    public static void main(String[] args) {
        // created a scanner class object
        Scanner sc = new Scanner(System.in);

        //create initial accounts
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        Account C[] = new Account[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Account();
            C[i].createAccount();
        }

        // loop runs until number 4 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Show Account Details \n2. Deposit the amount \n3. Withdraw the amount \n 4.Exit ");
            System.out.println("Enter your choice: ");

            // switch case to choose method
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (Account value : C) {
                        value.showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account no. : ");
                    long ac_no = sc.nextLong();
                    boolean found = false;
                    for (Account account : C) {
                        found = account.search(ac_no);
                        if (found) {
                            account.depositAmount();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.nextLong();
                    found = false;
                    for (Account account : C) {
                        found = account.search(ac_no);
                        if (found) {
                            account.withdrawAmount();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 4);
    }
}
