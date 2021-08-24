package com.citi.training.StockPortfolioManager.repo;

import com.citi.training.StockPortfolioManager.entities.NetWorth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import java.util.Date;

public interface NetWorthRepository extends JpaRepository<NetWorth, Date>, Repository<NetWorth, Date>
{

}