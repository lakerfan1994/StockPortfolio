package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Accounts;
import java.util.Collection;

public interface AccountService
{
    Collection<Accounts> getAllAccounts();
    Accounts getAccount(int accountNumber);
    Accounts addAccount(Accounts account);
    Accounts updateAccount(Accounts account);
    void deleteAccount(int accountNumber);
}
