package com.asset.management.puja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asset.management.puja.controller.service.AssetService;
import com.asset.management.puja.model.Category;

@RestController
public class CategoryController {
	@Autowired
	AssetService assetService;
	
	@PostMapping("/AddCategory")
	
	private Object AddCategory(@RequestBody Category CategoryDto) {
		return assetService.Add_An_Category(CategoryDto);
	}
	

	@PutMapping("/UpdateCategory")
	private String update(@RequestBody Category categoryDto) {
	return assetService.update(categoryDto);
  }

	@GetMapping("/AllCategory")
	private List<Category> getAll(){
		return  assetService.getAll();
	}
	

 }
