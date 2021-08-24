package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import java.util.Collection;

public interface StockService {
    Collection<Stocks> getAllTransactions();
    Stocks getTransaction(int transaction);
    Stocks addTransaction(Stocks stock);
    // This is delete. Assume we are selling stock by transaction # for now.
    void sellStock(int transaction);
    Collection<Stocks> findTop5Gainers();
    Collection<Stocks> findTop5Losers();
}
