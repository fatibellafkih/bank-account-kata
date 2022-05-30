package com.bellafkih.bankaccountkataapi.service;

import com.bellafkih.bankaccountkataapi.model.Account;
import com.bellafkih.bankaccountkataapi.model.Client;
import com.bellafkih.bankaccountkataapi.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;


@Service
public class AccountService {
    Account a1 = new Account("Fatima BELLAFKIH");

    public ArrayList<Transaction> getHistory() {
        return a1.getHistory();
    }

    public void depositAmount(Transaction t) {
        float currentBalance = a1.getBalance() + t.getAmount();
        a1.setBalance(currentBalance);
        t.setBalance(currentBalance);
        a1.getHistory().add(t);
    }

    public void retrieveAmount(Transaction t) {
        float currentBalance = a1.getBalance() - t.getAmount();
        a1.setBalance(currentBalance);
        t.setBalance(currentBalance);
        a1.getHistory().add(t);
    }

}
