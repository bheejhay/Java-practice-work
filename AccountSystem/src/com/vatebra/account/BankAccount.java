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
public class BankAccount {

    private String acccountNumber, accountName;
    protected double balance;

    public BankAccount() {
    }

    public BankAccount(String acccountNumber, String accountName, double balance) {
        this.acccountNumber = acccountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(String acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        return amount;
    }

    public boolean withdraw(double amount) {
        balance = balance - amount;
        if (balance > amount) {
            return true;
        } else {
            return false;
        }
    }

}
