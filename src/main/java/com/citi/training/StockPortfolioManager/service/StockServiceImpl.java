package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import com.citi.training.StockPortfolioManager.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;

    @Override
    public Collection<Stocks> getAllTransactions() {
        return stockRepository.findAll();
    }

    @Override
    public Stocks getTransaction(int transaction){
        return stockRepository.findById(transaction).get();
    }

    @Override
    public Stocks addTransaction(Stocks stock) {return stockRepository.save(stock);}

    // This is delete. Assume we are selling stock by transaction # for now.
    @Override
    public void sellStock(int transaction) {stockRepository.deleteById(transaction);}

//    @Override
//    public Collection<Stocks> findTop5Gainers()
//    {
//        ArrayList<Stocks> temp = new ArrayList<>(stockRepository.findAll());
//
//        // Sorting is done in-place with Stocks objects in ascending order based on price
//        Collections.sort(temp, new SortByPrice());
//
//        // Reverse sorting is done in-place to make Stocks objects in descending order
//        Collections.sort(temp, Collections.reverseOrder());
//
//        ArrayList<Stocks> topFive = new ArrayList<Stocks>();
//
//        int i = 1;
//
//        for (Stocks s : temp)
//        {
//            if (i != 5)
//            {
//                topFive.add(s);
//                i++;
//            }
//        }
//
//        return topFive;
//    }

//    @Override
//    public Collection<Stocks> findTop5Losers()
//    {
//        ArrayList<Stocks> temp = new ArrayList<>(stockRepository.findAll());
//
//        // Sorting is done in-place with Stocks objects in ascending order based on price
//        Collections.sort(temp, new SortByPrice());
//
//        ArrayList<Stocks> bottomFive = new ArrayList<Stocks>();
//
//        int i = 1;
//
//        for (Stocks s : temp)
//        {
//            if (i != 5)
//            {
//                bottomFive.add(s);
//                i++;
//            }
//        }
//
//        return bottomFive;
//    }
}
