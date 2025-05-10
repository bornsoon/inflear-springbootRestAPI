package com.helloworld.quickstart.dto;

public class ItemDto {
    private String id;
    private String name;

    // Alt + Ins 누르면 자동 완성 메뉴
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
