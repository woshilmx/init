package com.example.service;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AssetIdGenerator {

    public int generateAssetId() {
        // Generate the asset ID using the specified logic
        UUID uuid = UUID.randomUUID();
        String assetId = uuid.toString().replace("-", "");
        return Integer.parseInt(assetId.substring(0, 9));
    }
}