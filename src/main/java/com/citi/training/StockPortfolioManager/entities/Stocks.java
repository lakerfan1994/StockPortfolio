package com.citi.training.StockPortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="stocks")
public class Stocks implements Serializable {
    //attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Transaction")
    private int transaction;

    @Column(name="Ticker")
    private String ticker;

    @Column(name="Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="Price")
    private float price;

    @Column(name="Amount")
    private float amount;

    //default constructor
    public Stocks(){

    }

    public Stocks(int transaction, String ticker, Date date, float price, float amount) {
        this.transaction = transaction;
        this.ticker = ticker;
        this.date = date;
        this.price = price;
        this.amount = amount;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
