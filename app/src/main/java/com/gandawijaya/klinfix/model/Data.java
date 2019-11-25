package com.gandawijaya.klinfix.model;

public class Data {
    String id,username,name,address,phone,email,status;
    Transaction transaction[];

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }
}
