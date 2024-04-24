package com.basith.project.NiqData.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "shopper_personalized_product_list")
public class ShopperPersonalizedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "shopper_id")
    private String shopperId; // Assuming this is a foreign key

    @Column(name = "product_id")
    private String productId;

    @Column(name = "relevancy_score")
    private double relevancyScore;

    public ShopperPersonalizedProduct() {
    }

    public ShopperPersonalizedProduct(String shopperId, String productId, double relevancyScore) {
        this.shopperId = shopperId;
        this.productId = productId;
        this.relevancyScore = relevancyScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}