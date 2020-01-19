/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.interest;

/**
 *
 * @author OAdelodun
 */
public class BankAccount {
    private String accountNumber,accountName;
    private double balance;
    private static double interestRate;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }
    
   public void deposit(double amount){
       balance = balance + amount;
   } 
   
   public boolean withdraw(double amount){
       if(amount>balance){
           return false;
       }else{
           balance = balance - amount;
           return true;
       }
   }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
   
   public void addInterest(){
       balance = balance + (balance * interestRate)/100 ;
   }
    
    
    
}
