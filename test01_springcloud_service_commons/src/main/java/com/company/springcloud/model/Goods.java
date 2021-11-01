package com.company.springcloud.model;

public class Goods {
    private String name;
    private String message;
    private Integer id;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Goods(String name, String message, Integer id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }
}
