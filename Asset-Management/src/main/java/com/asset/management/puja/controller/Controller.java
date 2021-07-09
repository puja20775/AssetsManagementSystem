package com.asset.management.puja.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asset.management.puja.controller.service.AssetService;
import com.asset.management.puja.model.Assets;
import com.asset.management.puja.repository.AssetsRepository;
import com.sipios.springsearch.anotation.SearchSpec;

@RestController
public class Controller {
	
	@Autowired
	AssetService assetService;
	
	@Autowired 
	AssetsRepository assetsRepository;
	
//-------------------- API for add single Assets to the company------------------------------------------------	
	@Test
	@PostMapping("/AddAnAssets")
	
	private Object Add_An_Asset(@RequestBody Assets AssetDto) {
		return assetService.Add_An_Asset(AssetDto);
	}
	
//-------------------- API for Get all Assets are stored in the company------------------------------------------------	
	@GetMapping("/ListOfAllAssets")
	private List<Assets> ListOfAllAssets(){
		return  assetService.ListOfAllAssets();
	}
	
	
	
////-------------------- API for search assets based on name------------------------------------------------		
//		@GetMapping("/get/{assetName}")
//		private Assets get(@PathVariable("assetName") String assetName) {
//			return assetService.get(assetName);
//		}
//	
//	
//	@GetMapping("/assets")
//	public ResponseEntity<List<Assets>> searchForAssets(@SearchSpec Specification<Assets> specs){
//		return new ResponseEntity<>(assetsRepository.findAll(Specification.where(specs)), HttpStatus.OK);
//	}
	
//------------------------API for update an asset-------------------------------------------------------
	@PutMapping("/UpdateAnAsset")
	private String update(@RequestBody Assets assetsDto) {
		return assetService.update(assetsDto);
	}
	

//--------------------------API for delete An ASsets----------------------------------------------------
	@DeleteMapping("/delete/{assetId}")
	private String del(@PathVariable("assetId") Long assetId) {
		return assetService.del(assetId);
	}
	
	//-----------------Recover an assets to an employee-------------------------------------------------------
	@GetMapping("/get/{empId}")
	private Assets get(@PathVariable("empId") Long empId) {
		return assetService.get(empId);
	}
}

