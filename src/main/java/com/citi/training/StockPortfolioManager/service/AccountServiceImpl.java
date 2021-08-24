package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Accounts;
import com.citi.training.StockPortfolioManager.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository ar;

    @Override
    public Collection<Accounts> getAllAccounts() {
        return ar.findAll();
    }

    @Override
    public Accounts getAccount(int accountNumber) { return ar.findById(accountNumber).get(); }

    // A POST request creates a resource.
    // Running this will create a new entry in the database table for Accounts.
    @Override
    public Accounts addAccount(Accounts account) { return ar.save(account); }

    // A PUT request creates a resource or updates an existing resource.
    // We can use the same save() method to update an existing entry in our database.
    @Override
    public Accounts updateAccount(Accounts account){
        return ar.save(account);
    }

    @Override
    public void deleteAccount(int accountNumber) {ar.deleteById(accountNumber);}
}
