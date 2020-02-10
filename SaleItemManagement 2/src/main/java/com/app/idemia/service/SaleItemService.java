package com.app.idemia.service;

import com.app.idemia.dao.SaleItemDao;
import com.app.idemia.model.SaleItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleItemService {

    @Autowired
    private SaleItemDao saleItemDao ;

    public SaleItemService(SaleItemDao saleItemDao) {
        super();
        this.saleItemDao = saleItemDao;
    }


    public List<SaleItem> findAll(){


        return this.saleItemDao.findAll();
    }


    public void addSaleItem(List<SaleItem> saleItem) {
        this.saleItemDao.addSaleItem(saleItem);
    }


    public void deleteSaleItem(int saleItemId) {
        this.saleItemDao.delete(saleItemId);


    }

    public SaleItem update(SaleItem saleItem) {
        return this.saleItemDao.update(saleItem);
    }



}
