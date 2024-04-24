package com.basith.project.NiqData.Model;

public class Shelf {
    String productId;

    Double relevancyScore;

    public Shelf(String productId, Double relevancyScore) {
        this.productId = productId;
        this.relevancyScore = relevancyScore;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(Double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
