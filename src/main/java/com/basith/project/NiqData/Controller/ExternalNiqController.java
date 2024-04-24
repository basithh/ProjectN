package com.basith.project.NiqData.Controller;

import com.basith.project.NiqData.Constants.RequestMappingPath;
import com.basith.project.NiqData.Model.*;
import com.basith.project.NiqData.Service.ProductService;
import com.basith.project.NiqData.Service.ShopperPersonalizedService;
import com.basith.project.NiqData.Service.ShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "external")
public class ExternalNiqController {
    @Autowired
    private final ProductService productService;
    @Autowired
    private final ShopperService shopperService;
    @Autowired
    private final ShopperPersonalizedService shopperPersonalizedService;

    @Autowired
    public ExternalNiqController(ProductService productService, ShopperService shopperService, ShopperPersonalizedService shopperPersonalizedService) {
        this.productService = productService;
        this.shopperService = shopperService;
        this.shopperPersonalizedService = shopperPersonalizedService;
    }

    @GetMapping("/shopperFindById/{id}")
    public Shopper getShopperByID(@PathVariable String id) {
        return shopperService.getShopperById(id);
    }

    @GetMapping("/productFindById/{id}")
    public Product getProductByID(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @GetMapping("/shopperPersonalizedByShopperId/{id}")
    public ShopperPresonalizedProductResponse getPresonalizedProductResponse(@PathVariable String id) {
        return shopperPersonalizedService.getShopperPersonalizedProducts(id);
    }

}
