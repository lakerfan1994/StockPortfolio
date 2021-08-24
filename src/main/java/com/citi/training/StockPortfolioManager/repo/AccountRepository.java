package com.citi.training.StockPortfolioManager.repo;

import com.citi.training.StockPortfolioManager.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

// When an instance of this repository is instantiated, the underlying logic will
// automatically be in place for working with our Accounts class.
public interface AccountRepository extends JpaRepository<Accounts, Integer>, Repository<Accounts, Integer>
{

}
