package com.app.idemia.Controller;


import com.app.idemia.dao.impl.SaleItemDaoImpl;
import com.app.idemia.model.SaleItem;
import com.app.idemia.service.SaleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleItemController {

    @Autowired
    private SaleItemService saleItemService;

    public SaleItemController(SaleItemService saleItemService) {
        super();
        this.saleItemService = saleItemService;
    }


    @GetMapping("/allItem")
    public List<SaleItem>  getAllSaleItem(){

        return saleItemService.findAll();
    }

    @PostMapping("/addSaleItem")
    public  List<SaleItem> addSaleItem(@RequestBody List<SaleItem> saleItem){

        saleItemService.addSaleItem(saleItem);
        return saleItemService.findAll();

    }

    @PutMapping("/updateSaleItem")
    public SaleItem updateSaleItem(@RequestBody SaleItem saleItem) {

        return saleItemService.update(saleItem);

    }

    @DeleteMapping("/delSaleItem/{id}")
    public void deleteSaleItem(@PathVariable ("id") int saleItemId) {
        saleItemService.deleteSaleItem(saleItemId);

    }

}

