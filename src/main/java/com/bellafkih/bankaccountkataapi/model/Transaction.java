package com.bellafkih.bankaccountkataapi.model;

import java.util.Date;

public class Transaction {
    private final float amount;
    private final Date date;
    private final String type;
    private float balance = 0;

    public Transaction(final float amount, String type) {
        this.amount = amount;
        this.date = new Date();
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public float getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getType(){
        return type;
    }
    /*  (operation, date, amount, balance) */

    public void setBalance(float balance){
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "( " + type + ", " + date + ", " + amount + ", " + balance + " )";
    }
}
