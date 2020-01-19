/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.test;

import com.bank.dao.impl.BankDAOImpl;
import com.bank.interest.BankAccount;
import com.bank.util.EasyScanner;

/**
 *
 * @author OAdelodun
 */
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char choice;
        BankDAOImpl myBank = new BankDAOImpl();

        do {
            System.out.println();
            System.out.println("1. Create new account");
            System.out.println("2. Remove an account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check account details");
            System.out.println("6. Quit");

            System.out.println();
            System.out.print("Enter choice [1-6]: ");
            choice = EasyScanner.nextChar();

            switch (choice) {
                case '1':
                    option1(myBank);
                    break;
                case '2':
                    option2(myBank);
                    break;
                case '3':
                    option3(myBank);
                    break;
                case '4':
                    option4(myBank);
                    break;
                case '5':
                    option5(myBank);
                    break;
            }
        } while (choice != '6');
    }

    //add account
    public static void option1(BankDAOImpl createAccount) {
        System.out.print("Enter account number:  ");
        String accNum = EasyScanner.nextString();
        System.out.print("Enter account name:  ");
        String accName = EasyScanner.nextString();

        boolean success = createAccount.addAccount(accNum, accName);
        if (success) {
            System.out.println("Account added");
        } else {
            System.out.println("Accout number already exists");
        }
    }

    //remove account
    public static void option2(BankDAOImpl removeAccount) {
        System.out.print("Enter account number: ");
        String accNum = EasyScanner.nextString();
        boolean found = removeAccount.removeAccount(accNum);
        if (found) {
            System.out.println("Account removed.");
        } else {
            System.out.println("No such account number");
        }
    }

    public static void option3(BankDAOImpl depositIn) {
        //depost money
        System.out.print("Enter account number: ");
        String accNum = EasyScanner.nextString();
        System.out.print("Enter amount to deposit: ");
        double amount = EasyScanner.nextDouble();
        boolean found = depositIn.depositMoney(accNum, amount);
        if (found) {
            System.out.println("Money deposited");
        } else {
            System.out.println("No such account");
        }
    }

    //withdraw money
    public static void option4(BankDAOImpl withdrawIn) {
        System.out.print("Enter account number: ");
        String acctNum = EasyScanner.nextString();
        System.out.println("Enter amount to deposit: ");
        double amount = EasyScanner.nextDouble();

        boolean ok = withdrawIn.withdrawMoney(acctNum, amount);
        if (ok) {
            System.out.println("Withdrawal made");
        } else {
            System.out.println("No such account or insufficient funds");
        }
    }
    
    public static void option5(BankDAOImpl accountDetails){
        System.out.print("Enter account number: ");
        String acctNum = EasyScanner.nextString();
        BankAccount acct = accountDetails.getItem(acctNum);
        
        if(acct != null){
            System.out.println("Account number: " + acct.getAccountNumber());
            System.out.println("Account name: " + acct.getAccountName());
            System.out.println("Balance: " + acct.getBalance());
            System.out.println();
        }else{
            System.out.println("No such account");
        }
    }

}
