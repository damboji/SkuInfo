package com.ww.dileep.skuInfo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.dileep.skuInfo.entity.Sku;
import com.ww.dileep.skuInfo.repository.SkuRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SkuService {

	private static final Logger log = null;

	@Autowired
	private SkuRepository skuRepo;

	public Sku saveSku(Sku sku) {
		return skuRepo.save(sku);
	}

	public Sku findBySkuId(int skuId) {
		// TODO Auto-generated method stub
		return skuRepo.findBySkuId(skuId);
	}
	
	public List<Sku> findAllSku() {
		// TODO Auto-generated method stub
		return skuRepo.findAll();
	}
	
	public boolean deleteBySkuId(int skuId) {
		// TODO Auto-generated method stub
		skuRepo.deleteById(skuId);
		return true;
	}

	public Sku updateSku(Sku sku) {
		// TODO Auto-generated method stub
		return skuRepo.save(sku);
	}

	public List<Sku> findSkuByProductId(int productId) {
		return skuRepo.findSkuByProductId(productId);
	}
}
