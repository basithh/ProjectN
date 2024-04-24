package com.basith.project.NiqData.Repository;

import com.basith.project.NiqData.Model.ShopperPersonalizedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopperPersonalizedProductRepository extends JpaRepository<ShopperPersonalizedProduct, Long> {
    List<ShopperPersonalizedProduct> findByShopperId(String shopperId);

}