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

    @Column(name="ticker")
    private String ticker;

    @Column(name="purchased_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="amount")
    private float amount;

    //default constructor
    public Stocks(){

    }

    public Stocks( String ticker, Date date,  float amount) {
        this.ticker = ticker;
        this.date = date;
        this.amount = amount;
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

//    public float getPrice() {
////        return price;
////    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
