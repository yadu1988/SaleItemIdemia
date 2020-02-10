package com.app.idemia.model;

import javax.persistence.*;


@Entity

public class SaleItem {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int saleItemId;
    private String saleItemName;
    private double saleItemPrice;
    private int saleDiscount;

    public SaleItem() {
        super();
    }

    public SaleItem(int saleItemId, String saleItemName, double saleItemPrice, int saleDiscount) {
        super();
        this.saleItemId = saleItemId;
        this.saleItemName = saleItemName;
        this.saleItemPrice = saleItemPrice;
        this.saleDiscount = saleDiscount;
    }

    public int getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(int saleItemId) {
        this.saleItemId = saleItemId;
    }

    public String getSaleItemName() {
        return saleItemName;
    }

    public void setSaleItemName(String saleItemName) {
        this.saleItemName = saleItemName;
    }

    public double getSaleItemPrice() {
        return saleItemPrice;
    }

    public void setSaleItemPrice(double saleItemPrice) {
        this.saleItemPrice = saleItemPrice;
    }

    public int getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(int saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    @Override
    public String toString() {
        return "SaleItem [saleItemId=" + saleItemId + ", saleItemName=" + saleItemName + ", saleItemPrice="
                + saleItemPrice + ", saleDiscount=" + saleDiscount + "]";
    }




}



