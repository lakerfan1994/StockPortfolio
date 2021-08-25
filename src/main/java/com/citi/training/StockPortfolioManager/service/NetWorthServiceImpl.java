//package com.citi.training.StockPortfolioManager.service;
//
//import com.citi.training.StockPortfolioManager.entities.NetWorth;
//import com.citi.training.StockPortfolioManager.repo.NetWorthRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Collection;
//import java.util.Date;
//
//@Service
//public class NetWorthServiceImpl implements NetWorthService
//{
//    @Autowired
//    private NetWorthRepository netWorthRepository;
//
//    // Assuming 'dd/MM/yyyy' for now until we see how the date is formatted in the database from Chuck
//    @Override
//    public NetWorth getNetWorth(String s) throws ParseException {
//        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(s);
//        NetWorth nw = netWorthRepository.findById(date2).get();
//        return nw;
//    }
//}
//
