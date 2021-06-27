package com.ww.dileep.skuInfo.repository;

import org.springframework.stereotype.Repository;
import com.ww.dileep.skuInfo.entity.Sku;

import java.util.List;

import org.springframework.data.jpa.repository.*;

@Repository
public interface SkuRepository extends JpaRepository<Sku, Integer> {

	Sku findBySkuId(int skuId);

	List<Sku> findSkuByProductId(int productId);
	

}
