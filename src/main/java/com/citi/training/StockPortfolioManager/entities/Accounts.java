package com.citi.training.StockPortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="accounts")
public class Accounts implements Serializable {
    // attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="AccountNumber")
    private int accountNumber;

    @Column(name="Bank")
    private String bank;

    @Column(name="Type")
    private String type;

    @Column(name="Balance")
    private float balance;

    //default constructor
    public Accounts(){

    }

    public Accounts(String bank, String type, float balance) {
        this.bank = bank;
        this.type = type;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
