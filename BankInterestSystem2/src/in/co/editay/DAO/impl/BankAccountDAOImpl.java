/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.editay.DAO.impl;

import in.co.editay.DAO.BankAccountDAO;
import in.co.editay.model.BankAccount;
import java.util.*;

/**
 *
 * @author OAdelodun
 */
public class BankAccountDAOImpl implements BankAccountDAO {

    List<BankAccount> list = new ArrayList<>();

    private int search(String accountNumber) {
        for (int i = 0; i < list.size(); i++) {
            BankAccount bankAccount = list.get(i);
            String accNumber = bankAccount.getAccountNumber();
            if (accNumber.equals(accountNumber)) {
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
        if (index != -999) {
            list.get(index);
        }
        return null;
    }

    @Override
    public boolean addAccount(String accountNumber, String accountName) {
        //check if account does not exist
        if (search(accountNumber) == -999) {
            //  BankAccount bankAcc = new BankAccount(accountNumber,accountName);
            list.add(new BankAccount(accountNumber, accountName));
            return true;
        }
        return false;
    }

    @Override
    public boolean depositMoney(String accountNumber, double amount) {
        //check for account exist
        BankAccount bankAccount = getItem(accountNumber);
        if (bankAccount != null) {
            bankAccount.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean withdrawMoney(String accountNumber, double amount) {
        BankAccount bankAccount = getItem(accountNumber);
        if (bankAccount != null && bankAccount.getBalance() >= amount) {
            bankAccount.withdraw(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeAccount(String accountNumber) {
        int index = search(accountNumber);
        if (index != -999) {
            list.remove(index);
            return true;
        } else {
            return false;
        }
    }

}
