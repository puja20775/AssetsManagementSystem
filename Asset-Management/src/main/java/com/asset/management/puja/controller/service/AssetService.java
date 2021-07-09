package com.asset.management.puja.controller.service;

import java.util.List;

import com.asset.management.puja.model.Assets;
import com.asset.management.puja.model.Category;

public interface AssetService {

	Object Add_An_Asset(Assets AssetDto);

	List<Assets> ListOfAllAssets();

	String update(Assets assetsDto);

	

	String update(Category categoryDto);

	Object Add_An_Category(Category categoryDto);

	List<Category> getAll();

	String del(Long assetId);

	Assets get(Long empId);

	//Assets get(String assetName);

}
