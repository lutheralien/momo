package com.alienx;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program TO Prevent Hackers From Changing Account Details");
        Abaaneke person = new Abaaneke();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please Enter Account Name: ");
        String name  = userInput.nextLine();
        person.accountName = name;
        while (true) {
            System.out.println("1) Display Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4)press 4 to exit");
            System.out.print("5) press any number other than the options above to repeat this menu: ");
            try {
                int option = userInput.nextByte();
//            if (option != 1 || option != 2 || option != 3) break;
                if (option == 1) {
                    person.accountName = name;
                    person.DisplayBalance();
                } else if (option == 2) {
                    person.accountName = name;
                    person.MakeDeposit();
                } else if (option == 3) {
                    person.accountName = name;
                    person.makeWithdrawal();
                } else if (option == 4) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Input Incorrect, use numbers instead of letters or symbols and special characters");
                return;
            }

        }

    }
}


