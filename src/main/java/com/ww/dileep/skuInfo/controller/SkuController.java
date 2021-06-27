package com.ww.dileep.skuInfo.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ww.dileep.skuInfo.entity.Sku;
import com.ww.dileep.skuInfo.service.SkuService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/sku")
@Slf4j
public class SkuController {
	
	private static final Logger log = null;
	
	@Autowired
	private SkuService skuService;
	
	@PostMapping("/save")
	public Sku saveProduct(@RequestBody Sku sku) {
		//log.info("Inside saveProduct method in ProductController ");
		return skuService.saveSku(sku);
	}

	@GetMapping("/{id}")
	public Sku findSkuById(@PathVariable("id") int skuId) {
		//log.info("Inside findProductById  method in ProductController ");
		return skuService.findBySkuId(skuId);

	}
	
	@GetMapping("/byproduct/{id}")
	public List<Sku> findSkuByProductId(@PathVariable("id") int productId) {
		return skuService.findSkuByProductId(productId);

	}
	
	
	@GetMapping("/findall")
	public List<Sku> findAllSku() {
		return skuService.findAllSku();

	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable("id") int skuId) {
		//log.info("Inside findProductById  method in ProductController ");
		skuService.deleteBySkuId(skuId);
		return "Successfully deleted: " +skuId;

	}
	
	@PutMapping("/update")
	public Sku updateSku(@RequestBody Sku sku) {
		//log.info("Inside saveProduct method in ProductController ");
		return skuService.updateSku(sku);
	}
}
