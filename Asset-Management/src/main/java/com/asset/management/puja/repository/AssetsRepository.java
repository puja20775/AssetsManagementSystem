package com.asset.management.puja.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.asset.management.puja.model.Assets;
import com.asset.management.puja.model.Category;

public interface AssetsRepository extends JpaRepository<Assets, Long> {


	Optional<Assets> findByAssetIdAndAssetName(Long assetId, String assetName);

	Optional<Assets> findByAssetName(String assetName);


	
}
