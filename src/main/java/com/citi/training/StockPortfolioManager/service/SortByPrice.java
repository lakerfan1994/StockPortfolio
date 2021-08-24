package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import java.util.Comparator;

public class SortByPrice implements Comparator<Stocks>
{
    // Used for sorting in ascending order stock prices
    public int compare(Stocks a, Stocks b)
    {
        return Math.round(a.getPrice() - b.getPrice());
    }
}
