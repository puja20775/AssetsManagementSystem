package com.asset.management.puja.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.asset.management.puja.controller.service.AssetService;
import com.asset.management.puja.dto.AssetDto;
import com.asset.management.puja.dto.CategoryDto;
import com.asset.management.puja.model.Assets;
import com.asset.management.puja.model.Category;
import com.asset.management.puja.repository.AssetsRepository;
import com.asset.management.puja.repository.CategoryRepository;


@Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	AssetsRepository assetsRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Test
	
//-------------------- API for add single Assets to the company------------------------------------------------	
	@Override
	public Object Add_An_Asset(Assets AssetDto) {

		Optional<Assets> data = assetsRepository.findByAssetIdAndAssetName(AssetDto.getAssetId(),AssetDto.getAssetName());
		if(!data.isPresent()) {
			assetsRepository.save(AssetDto);
			return "Asset is listed successfully";
		} else {
		return "This Asset is already in the list";
		}
	}

//-------------------- API for Get all Assets are stored in the company------------------------------------------------	
	@Override

		public List<Assets> ListOfAllAssets() {
		List<Assets> list=new ArrayList<>();
		assetsRepository.findAll().forEach(e -> list.add(e)); //for each is a lembda expression
		
		return list;
		}

	@Override
		public String update(Assets assetsDto) {
		Optional<Assets> data = assetsRepository.findById(assetsDto.getAssetId());
		if(!data.isPresent()) {
			return "data not found";
		} else {
			Assets dataOfAssets = data.get();
			dataOfAssets.setAssetName(assetsDto.getAssetName());
			dataOfAssets.setConditionNotes(assetsDto.getConditionNotes());
			dataOfAssets.setCategoryName(assetsDto.getCategoryName());
			dataOfAssets.setStatus(assetsDto.getStatus());


			assetsRepository.save(dataOfAssets);
			return "update successfully";

		}
	
		}

	@Override
	public String del(Long assetId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Assets get(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
//	@Override
//	public Assets get(String assetName) {
//		Optional<Assets> data = assetsRepository.findByAssetName(AssetDto.getAssetName());
//		if(data.isPresent()) {
//
//		return assetsRepository.findByAssetName(assetName).get();
//		}
//		}
	
//************************Category Controller*********************************************************	
	@Override
	public Object Add_An_Category(Category categoryDto) {
		Optional<Category> data = categoryRepository.findByCategoryIdAndCategoryName(categoryDto.getCategoryId(),categoryDto.getCategoryName());
		if(!data.isPresent()) {
			categoryRepository.save(categoryDto);
			return "Asset is listed successfully";
		} else {
		return "This Asset is already in the list";
		}
			
	}

	@Override
		public String update(Category categoryDto) {

		Optional<Category> data = categoryRepository.findById(categoryDto.getCategoryId());
		if(!data.isPresent()) {
			return "data not found";
		
		} else {
			Category dataOfCategory = data.get();
			dataOfCategory.setCategoryName(categoryDto.getCategoryName());
			dataOfCategory.setDiscription(categoryDto.getDiscription());
			
			categoryRepository.save(dataOfCategory);
			return "update successfully";

		}

		}

	@Override
	public List<Category> getAll() {
		List<Category> list=new ArrayList<>();
		categoryRepository.findAll().forEach(e -> list.add(e)); //for each is a lembda expression
		
		return list;

	}
	
}
	
	


	
	

