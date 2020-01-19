/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.editay.test;

import in.co.editay.DAO.impl.BankAccountDAOImpl;
import in.co.editay.model.BankAccount;
import in.co.editay.util.ScannerUtil;

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
        BankAccountDAOImpl dao = new BankAccountDAOImpl();
        char choice;

        do {
            System.out.println();
            System.out.println("1. Create new account");
            System.out.println("2. Remove account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check account details");
            System.out.println("6. Quit");

            System.out.println("Enter choice [1-6]: ");
            choice = ScannerUtil.nextChar();

            switch (choice) {
                case '1':
                    option1(dao);
                    break;
                case '2':
                    option2(dao);
                    break;
                case '3':
                    option3(dao);
                    break;
                case '4':
                    option4(dao);
                    break;
                case '5': option5(dao);
                          break;
            }

        } while (choice != '6');
    }

    public static void option1(BankAccountDAOImpl bankAccDaoImpl) {
        System.out.print("Enter account number: ");
        String accountNumber = ScannerUtil.nextString();
        System.out.print("Enter account name: ");
        String accountName = ScannerUtil.nextString();

        boolean success = bankAccDaoImpl.addAccount(accountNumber, accountName);
        if (success) {
            System.out.println("Account successfully added");
        } else {
            System.out.println("Account number already exist");
        }
    }

    public static void option2(BankAccountDAOImpl bankAccDaoImpl) {
        System.out.print("Enter account number: ");
        String accountNumber = ScannerUtil.nextString();
        boolean found = bankAccDaoImpl.removeAccount(accountNumber);
        if (found) {
            System.out.println("Account succssfully removed.");
        } else {
            System.out.println("Account not found");
        }

    }

    public static void option3(BankAccountDAOImpl bankAccDaoImpl) {
        System.out.print("Enter account number: ");
        String accountNumber = ScannerUtil.nextString();
        System.out.print("Enter amount: ");
        double amount = ScannerUtil.nextDouble();
        boolean found = bankAccDaoImpl.depositMoney(accountNumber, amount);
        if (found) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Account not found");
        }
    }

    public static void option4(BankAccountDAOImpl bankAccDaoImpl) {
        System.out.print("Enter account number: ");
        String accountNumber = ScannerUtil.nextString();
        System.out.print("Enter amount: ");
        double amount = ScannerUtil.nextDouble();
        boolean found = bankAccDaoImpl.withdrawMoney(accountNumber, amount);
        if (found) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Account not found");
        }
    }
    
     public static void option5(BankAccountDAOImpl bankAccDaoImpl){
        System.out.print("Enter account number: ");
        String acctNum = ScannerUtil.nextString();
        BankAccount acct = bankAccDaoImpl.getItem(acctNum);
        
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
