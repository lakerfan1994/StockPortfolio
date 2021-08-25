package com.citi.training.StockPortfolioManager.rest;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import com.citi.training.StockPortfolioManager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    //get list of all stocks
    @RequestMapping("/getAllStocks")
    @GetMapping
    public Collection<Stocks> getAllTransactions() {
        return stockService.getAllTransactions();
    }

    //get stock by transaction #
    @GetMapping(value="/getStock/{id}")
    public Stocks getTransaction(@PathVariable("id") int id) {
        return stockService.getTransaction(id);
    }

    //add stock to a database
    @PostMapping("/postStock")
    public Stocks addTransaction(@RequestBody Stocks stock){
        return stockService.addTransaction(stock);
    }

    //delete stock
    @DeleteMapping("/deleteStock/{id}")
    public void sellStock(@PathVariable("symbol") int id) {
        stockService.sellStock(id);
    }

    //top stock (by earning)
//    @GetMapping("/gettopfive")
//    public Collection<Stocks> findTopFive() {
//        return stockService.findTop5Gainers();
//    }

    //bottom stock (by earning)
//    @GetMapping("/getbottomfive")
//    public Collection<Stocks> findBottomFive() {
//        return stockService.findTop5Losers();
    }

//    //get top 5 earnings for stock
//    @RequestMapping("/top5gains")
//    @GetMapping
//    public Collection<Stocks> top5Gains(){
//        return stockService.getTop5();
//    }

//    @RequestMapping(value = "/stocks", method = RequestMethod.GET)
//    public Collection<Stocks> getStocks() {
//        return stocks.values();
//    }

//    @PutMapping
//    public void addStock(@RequestBody Stocks s) {
//        if (stocks.containsKey(s.getSymbol())) {
//            stocks.put(s.getSymbol(), s);
//        }
//    }







