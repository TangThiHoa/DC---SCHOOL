package com.daicent.model;

import java.util.Objects;

public class Clazz {

    private int id;
    private String nameClazz;

    public Clazz() {
    }

    public Clazz(int id, String nameClazz) {
        this.id = id;
        this.nameClazz = nameClazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClazz() {
        return nameClazz;
    }

    public void setNameClazz(String nameClazz) {
        this.nameClazz = nameClazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return id == clazz.id && Objects.equals(nameClazz, clazz.nameClazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameClazz);
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", nameClazz='" + nameClazz + '\'' +
                '}';
    }
}
