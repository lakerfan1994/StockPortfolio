package com.citi.training.StockPortfolioManager.repo;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StockRepository extends JpaRepository<Stocks, Integer>, Repository<Stocks, Integer>
{

}
