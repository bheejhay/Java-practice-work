/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.dao;

import com.bank.interest.BankAccount;

/**
 *
 * @author OAdelodun
 */
public interface BankDAO {

    public int getTotal();

    public BankAccount getItem(String accountNumber);

    public boolean addAccount(String accountNumber, String accountName);

    public boolean depositMoney(String accountNumber, double amount);

    public boolean withdrawMoney(String accountNumber, double amount);

    public boolean removeAccount(String accountNumber);
}
