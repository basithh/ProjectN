package com.basith.project.NiqData.Service;

import com.basith.project.NiqData.Model.*;
import com.basith.project.NiqData.Repository.ProductRepository;
import com.basith.project.NiqData.Repository.ShopperPersonalizedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopperPersonalizedService {

    private final ProductRepository productRepository;

    private final ShopperPersonalizedProductRepository shopperPersonalizedProductRepository;


    @Autowired
    public ShopperPersonalizedService(ProductRepository productRepository, ShopperPersonalizedProductRepository shopperPersonalizedProductRepository) {
        this.productRepository = productRepository;
        this.shopperPersonalizedProductRepository = shopperPersonalizedProductRepository;
    }

    public  ShopperPersonalizedProduct createShopperPersonalizedService(ShopperPersonalizedProduct shopperPersonalizedProduct) {
        return shopperPersonalizedProductRepository.save(shopperPersonalizedProduct);
    }

    public ShopperPresonalizedProductResponse getShopperPersonalizedProducts(String shopperId) {
        List<ShopperPersonalizedProduct> personalizedProducts =
                shopperPersonalizedProductRepository.findByShopperId(shopperId);

        ShopperPresonalizedProductResponse response = new ShopperPresonalizedProductResponse();
        response.setShopperId(shopperId);

        List<Shelf> shelf = new ArrayList<>();
        for (ShopperPersonalizedProduct product : personalizedProducts) {
            Shelf shelfItem = new Shelf(product.getProductId(),product.getRelevancyScore());
            response.getShelf().add(shelfItem);
        }
        return response;
    }


}
