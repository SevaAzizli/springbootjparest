package com.springbootjparest.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alien {

    @Id
    private int id;
    private String name;
    private String zlang;




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

    public String getZlang() {
        return zlang;
    }

    public void setZlang(String zlang) {
        this.zlang = zlang;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zlang='" + zlang + '\'' +
                '}';
    }
}