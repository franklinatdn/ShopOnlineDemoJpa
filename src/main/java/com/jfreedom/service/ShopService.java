package com.jfreedom.service;

import java.util.List;

import com.jfreedom.model.Shop;

public interface ShopService {

	public List<Shop> getAllShops();
	public  Shop findOneId();
	/*public  List<Shop> findAllArray();*/
}
