package com.basith.project.NiqData.Controller;

import com.basith.project.NiqData.Model.*;
import com.basith.project.NiqData.Service.ProductService;
import com.basith.project.NiqData.Service.ShopperPersonalizedService;
import com.basith.project.NiqData.Service.ShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "internal")
public class InternalNiqController {

    @Autowired
    private final ProductService productService;
    @Autowired
    private final ShopperService shopperService;
    @Autowired
    private final ShopperPersonalizedService shopperPersonalizedService;

    @Autowired
    public InternalNiqController(ProductService productService, ShopperService shopperService, ShopperPersonalizedService shopperPersonalizedService) {
        this.productService = productService;
        this.shopperService = shopperService;
        this.shopperPersonalizedService = shopperPersonalizedService;
    }


    @PostMapping("/shopper")
    public Shopper createShopper(@RequestBody Shopper shopper) {
        return shopperService.createShopper(shopper);
    }

    @GetMapping("/shopper/{id}")
    public Shopper getShopperByID(@PathVariable String id) {
        return shopperService.getShopperById(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/productFindAll")
    public List<Product> getProductAll() {
        return productService.getAllProducts();
    }


    @PostMapping("/shopperPersonalized")
    public ShopperPersonalizedProduct createShopperPersonalized(@RequestBody ShopperPersonalizedProduct shopperPersonalizedProduct) {
        return shopperPersonalizedService.createShopperPersonalizedService(shopperPersonalizedProduct);
    }

    @GetMapping("/shopperPersonalizedBy/{id}")
    public ShopperPresonalizedProductResponse getPresonalizedProductResponse(@PathVariable String id) {
        return shopperPersonalizedService.getShopperPersonalizedProducts(id);
    }

}
