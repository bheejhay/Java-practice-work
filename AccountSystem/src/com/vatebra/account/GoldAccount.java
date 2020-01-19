/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.account;

/**
 *
 * @author OAdelodun
 */
public class GoldAccount extends BankAccount {

    private double overdraftLimit;

    public GoldAccount() {
    }

    public GoldAccount(double overdraftLimit, String acccountNumber, String accountName, double balance) {
        super(acccountNumber, accountName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public double deposit(double amount){
        return balance = balance + overdraftLimit + amount;
    }
    
    public double finalBalance(double amount,double balance,double overdraft){
        return balance = (balance + overdraft) - amount;
    }

    @Override
    public boolean withdraw(double amount) {
       
        if (((balance + overdraftLimit) - amount) > amount) {
            return true;
        } else {
            return false;
        }
    }
}
