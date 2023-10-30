package com.example.model;

import java.time.LocalDateTime;

public class AssetResponse {

    private int id;
    private String name;
    private String type;
    private LocalDateTime createTime;

    public AssetResponse(int id, String name, String type, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}