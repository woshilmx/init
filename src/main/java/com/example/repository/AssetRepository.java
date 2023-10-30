package com.example.repository;

import com.example.model.AssetRequest;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class AssetRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void recordAssetInfo(int assetId, AssetRequest assetRequest) {
        // Record the asset information in the database
        Asset asset = new Asset();
        asset.setAssetId(assetId);
        asset.setAssetName(assetRequest.getAssetName());
        asset.setAssetType(assetRequest.getAssetType());
        entityManager.persist(asset);
    }
}