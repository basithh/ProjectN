package com.basith.project.NiqData.Controller;

import com.basith.project.NiqData.Model.*;
import com.basith.project.NiqData.Service.ProductService;
import com.basith.project.NiqData.Service.ShopperPersonalizedService;
import com.basith.project.NiqData.Service.ShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NiqController {

    @Autowired
    private final ProductService productService;
    @Autowired
    private final ShopperService shopperService;
    @Autowired
    private final ShopperPersonalizedService shopperPersonalizedService;

    @Autowired
    public NiqController(ProductService productService, ShopperService shopperService, ShopperPersonalizedService shopperPersonalizedService) {
        this.productService = productService;
        this.shopperService = shopperService;
        this.shopperPersonalizedService = shopperPersonalizedService;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/version")
    public MessageResponse version(){
        return new MessageResponse("V1.0.0");
    }

    @RequestMapping(method = RequestMethod.GET,value = "/author")
    public MessageResponse author(){
        return new MessageResponse("Basith H");
    }


}
