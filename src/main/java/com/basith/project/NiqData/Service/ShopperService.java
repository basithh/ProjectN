package com.basith.project.NiqData.Service;

import com.basith.project.NiqData.Model.Product;
import com.basith.project.NiqData.Model.Shopper;
import com.basith.project.NiqData.Repository.ProductRepository;
import com.basith.project.NiqData.Repository.ShopperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopperService {
    private final ShopperRepository shopperRepository;

    @Autowired
    public ShopperService(ShopperRepository shopperRepository) {
        this.shopperRepository = shopperRepository;
    }

    public Shopper createShopper(Shopper shopper) {
        return shopperRepository.save(shopper);
    }

    public Shopper getShopperById(String id) {
        Optional<Shopper> optionalShopper = shopperRepository.findByShopperId(id);
        return optionalShopper.orElse(null);
    }


}
