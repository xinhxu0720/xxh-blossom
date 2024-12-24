package com.blossom.backend.repository.model;

public class UserStock {
    private Integer id;

    private String code;

    private String codeName;

    private String tal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getTal() {
        return tal;
    }

    public void setTal(String tal) {
        this.tal = tal == null ? null : tal.trim();
    }
}