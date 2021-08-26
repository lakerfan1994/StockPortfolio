package com.citi.training.StockPortfolioManager.rest;

import com.citi.training.StockPortfolioManager.entities.Accounts;
import com.citi.training.StockPortfolioManager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AccountController {
    @Autowired
    private AccountService as;

    // get list of all accounts

    @RequestMapping("/getAccounts")
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public Collection<Accounts> getAllAccounts() {
        return as.getAllAccounts();
    }

    // get an account
    @GetMapping(value="/getAccount/{id}")
    public Accounts getAccount(@PathVariable("id") int id) {
        return as.getAccount(id);
    }

    // add account to a database
    @PostMapping("/postAccount")
    public Accounts addAccount(@RequestBody Accounts account){
        return as.addAccount(account);
    }

    // update account in a database
    @PutMapping("/updateAccount")
    public Accounts updateAccount(@RequestBody Accounts account){
        return as.updateAccount(account);
    }

    // delete an account
    @DeleteMapping(value="/deleteAccount/{id}")
    public void deleteAccount(@PathVariable("id") int id) { as.deleteAccount(id); }
}





