package com.example.service;

import com.example.model.AssetRequest;
import com.example.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {

    @Autowired
    private AssetIdGenerator assetIdGenerator;

    @Autowired
    private AssetRepository assetRepository;

    public int generateAssetId() {
        return assetIdGenerator.generateAssetId();
    }

    public void recordAssetInfo(int assetId, AssetRequest assetRequest) {
        assetRepository.recordAssetInfo(assetId, assetRequest);
    }
}