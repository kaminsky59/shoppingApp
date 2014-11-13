package com.ShoppingApp.app;

/**
 * Created by Eugene K on 11/12/2014.
 */
public class CartItem {
    private String itemName = "";
    private Double price = 0.0;

    public void SetItemName(String itemName){
        this.itemName = itemName;
    }
    public String GetItemName(){
        return this.itemName;
    }

    public void SetPrice(Double price ){
        this.price = price;
    }
    public Double GetPrice(){
        return this.price;
    }
}