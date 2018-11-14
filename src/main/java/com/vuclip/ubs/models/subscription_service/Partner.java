package com.vuclip.ubs.models.subscription_service;

public enum Partner {
    UMOBILE("Umobile");

    private String name;

    private Partner(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
