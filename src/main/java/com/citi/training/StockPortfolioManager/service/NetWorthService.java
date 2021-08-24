package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.NetWorth;

import java.text.ParseException;

public interface NetWorthService
{
    NetWorth getNetWorth(String s) throws ParseException;
}
