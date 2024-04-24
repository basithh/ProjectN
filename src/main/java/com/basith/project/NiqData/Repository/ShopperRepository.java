package com.basith.project.NiqData.Repository;

import com.basith.project.NiqData.Model.Shopper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, Long> {
    Optional<Shopper> findByShopperId(String id);
}
