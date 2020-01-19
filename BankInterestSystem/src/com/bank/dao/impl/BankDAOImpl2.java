/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.dao.impl;

import com.bank.dao.BankDAO;
import com.bank.interest.BankAccount;
import java.util.ArrayList;

/**
 *
 * @author OAdelodun
 */
public class BankDAOImpl2 implements BankDAO {

    ArrayList<BankAccount> list = new ArrayList<>();

    private int search(String acctNumber) {
        for (int i = 0; i < list.size(); i++) {
            //find the account at index i
            BankAccount bankAccount = list.get(i);
            //get the account number
            String accountNumber = bankAccount.getAccountName();
            //if this is the account number we are looking for return the index
            if (accountNumber.equals(acctNumber)) {
                return i;
            }
        }
        return -999;
    }

    @Override
    public int getTotal() {
        return list.size();
    }

    @Override
    public BankAccount getItem(String accountNumber) {
        int index = search(accountNumber);
        //check if account number exist
        if (index == -999) {
            return list.get(index);
        } else {
            return null;
        }
    }

    @Override
    public boolean addAccount(String accountNumber, String accountName) {
        //check if account number does not exist
        if (search(accountNumber) == -999) {
            list.add(new BankAccount(accountNumber,accountName));
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean depositMoney(String accountNumber, double amount) {
        BankAccount bankAcc = getItem(accountNumber);
        if (bankAcc != null) {
            bankAcc.deposit(amount);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean withdrawMoney(String accountNumber, double amount) {
        BankAccount bankAcc = getItem(accountNumber);
        if(bankAcc != null && bankAcc.getBalance()>amount){
            bankAcc.withdraw(amount);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean removeAccount(String accountNumber) {
        int index = search(accountNumber);
        if(index != -999){
            list.remove(index);
            return true;
        }else{
            return false;
        }
    }
}
