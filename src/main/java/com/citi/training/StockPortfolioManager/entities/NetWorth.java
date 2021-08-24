package com.citi.training.StockPortfolioManager.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="networth")
public class NetWorth
{
    @Id
    @Column(name="Date")
    public Date date;

    @Column(name="CashValue")
    public float cashValue;

    @Column(name="InvestmentValue")
    public float investmentValue;

    //default constructor
    public NetWorth(){

    }

    public NetWorth(Date date, float cashValue, float investmentValue){
        this.date = date;
        this.cashValue = cashValue;
        this.investmentValue = investmentValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCashValue() {
        return cashValue;
    }

    public void setCashValue(float cashValue) {
        this.cashValue = cashValue;
    }

    public float getInvestmentValue() {
        return investmentValue;
    }

    public void setInvestmentValue(float investmentValue) {
        this.investmentValue = investmentValue;
    }
}


