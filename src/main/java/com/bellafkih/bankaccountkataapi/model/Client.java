package com.bellafkih.bankaccountkataapi.model;

public class Client {
    public static int id = 0;
    public final String fullname;

    public Client(String fullname) {
        this.id++;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fullname;
    }
}
