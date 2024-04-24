package com.basith.project.NiqData.Model;

import java.util.ArrayList;
import java.util.List;

public class ShopperPresonalizedProductResponse {

    String shopperId;

    List<Shelf> shelves;

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public List<Shelf> getShelf() {
        if (shelves == null){
            shelves = new ArrayList<>();
        }
        return shelves;
    }

}
