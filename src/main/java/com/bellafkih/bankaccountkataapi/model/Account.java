package com.bellafkih.bankaccountkataapi.model;
import java.util.ArrayList;

public class Account {
    private final String client;
    private ArrayList<Transaction> history;
    private float balance;


    public Account(String client) {
        this.client = client;
        this.balance = 0;
        this.history = new ArrayList<>();
    }


    public String getClient() {
        return client;
    }

    public ArrayList<Transaction> getHistory() {
        return history;
    }

    public float getBalance() {
        return balance;
    }

    public void setHistory(ArrayList<Transaction> history) {
        this.history = history;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}