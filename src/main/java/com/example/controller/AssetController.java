package com.example.controller;

import com.example.model.AssetRequest;
import com.example.model.AssetResponse;
import com.example.service.AssetService;
import com.example.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AssetController {

    @Autowired
    private AssetService assetService;

    @PutMapping("/assets")
    public ResponseEntity<AssetResponse> addAsset(@RequestBody AssetRequest assetRequest) {
        ValidationResult validationResult = validateAsset(assetRequest);
        if (!validationResult.isValid()) {
            return ResponseEntity.badRequest().body(new AssetResponse(validationResult.getErrors()));
        }

        int assetId = assetService.generateAssetId();
        assetService.recordAssetInfo(assetId, assetRequest);

        AssetResponse assetResponse = new AssetResponse(assetId, assetRequest.getName(), assetRequest.getType(), LocalDateTime.now());

        return ResponseEntity.ok(assetResponse);
    }

    private ValidationResult validateAsset(AssetRequest assetRequest) {
        ValidationResult validationResult = new ValidationResult();
        if (assetRequest.getName() == null || assetRequest.getName().isEmpty()) {
            validationResult.addError("Name is required");
        }
        if (assetRequest.getType() == null || assetRequest.getType().isEmpty()) {
            validationResult.addError("Type is required");
        }
        return validationResult;
    }
}