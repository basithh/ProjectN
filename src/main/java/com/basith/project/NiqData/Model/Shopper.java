package com.basith.project.NiqData.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shoppers")
public class Shopper {

    @Id
    @Column(name = "shopper_id")
    private String shopperId;

    @Column(name = "shopper_name")
    private String shopperName;

    public Shopper(){}

    public Shopper(String shopperId, String shopperName) {
        this.shopperId = shopperId;
        this.shopperName = shopperName;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getShopperName() {
        return shopperName;
    }

    public void setShopperName(String shopperName) {
        this.shopperName = shopperName;
    }
}
