package com.alienx;

import java.util.Scanner;

public class Abaaneke {
    //instantiating scanner class

    //fields
    private float withdrawal = 0.0F;
    private float deposit = 0.0F;
    private float oldBalance = 0.0F;
    private float newBalance = 0.0F;


    String accountName = "";

    //methods

    public void MakeDeposit() {
        System.out.println("=====Make Deposit==========");
        System.out.print("Enter Account Name: ");
        Scanner depositScanner = new Scanner(System.in);

        String accountNameDeposit = depositScanner.nextLine();
        if (!accountNameDeposit.equals(accountName)) {
            System.out.println("Account mismatch, Please check your name again");
            return;
        }
        System.out.print("Enter Amount Deposit: ");
        deposit = depositScanner.nextFloat();
        try {
            System.out.println("Account Name: " + accountName);
            System.out.println("Amount Deposited: " + deposit);
            System.out.println("Amount Withdrawn: " + withdrawal);
            newBalance += deposit;
            oldBalance = newBalance - deposit;
            System.out.println("old Balance: " + oldBalance);
            System.out.println("New Account Balance: " + newBalance);
        } catch (Exception e) {
            System.out.println("Enter Number instead of letters,symbols, and special characters");
        }
    }

    public void makeWithdrawal() {
        System.out.println("====Make Withdrawal==========");
        System.out.print("Enter Account Name: ");
        Scanner withdrawalScanner = new Scanner(System.in);
        String accountNameDeposit = withdrawalScanner.nextLine();
        if (!accountNameDeposit.equals(accountName)) {
            System.out.println("Account mismatch, Please check your name again");
            return;
        }
        System.out.print("Enter amount To Withdraw: ");
        withdrawal = withdrawalScanner.nextFloat();
        try {
            if (withdrawal > newBalance) {
                System.out.println("You Cannot Exceed Amount of Withdrawal From Current Account");
                System.out.println("Account Balance: " + newBalance);
                return;
            }
            System.out.println("Account Name: " + accountName);
            //reinitialize the old balance to the new balance(Amount left in the account)
            oldBalance = newBalance;
            System.out.println("Amount Withdrawn: " + withdrawal);
            System.out.println("old Balance: " + oldBalance);
            //new balance is then the new balance  - withdrawal;
            newBalance -= withdrawal;
            System.out.println("New Account Balance: " + newBalance);
        } catch (Exception e) {
            System.out.println("Enter Number instead of letters,symbols, and special characters");
            }
    }
    public void DisplayBalance() {
        System.out.println("=====Display Balance==========");
        System.out.print("Enter Account Name: ");
        Scanner balanceScanner = new Scanner(System.in);
        String accountNameDeposit = balanceScanner.nextLine();
        if (!accountNameDeposit.equals(accountName)) {
            System.out.println("Account mismatch, Please check your name again");
            return;
        }
        System.out.println("Account Name: " + accountName);
        System.out.println("Amount Deposited: " + deposit);
        System.out.println("Amount Withdrawn: " + withdrawal);
        System.out.println("old Balance: " + oldBalance);
        System.out.println("New Balance: " + newBalance);
    }
}
/*
Documentation of my algorithm
1)withdrawal is the variable that stores the amount deducted from the account
2)deposit is the amount the user will add to the existing account
3)old balance is the amount residing in the account before making deposit or withdrawal from and into the account respectively
4)new balance is the amount added or deducted to and from the account while a deposit or withdrawal is made
 */