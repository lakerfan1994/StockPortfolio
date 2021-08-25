package com.citi.training.StockPortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="accounts")
public class Accounts implements Serializable {
    // attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Date")
    private Date date;

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

    public Date getDate() {
        return this.date;
    }

    public void setAccountNumber(Date date) {
        this.date = date;
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
