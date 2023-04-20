package org.example.models;

public class DataClass {
    private int id;
    private String value1;
    private String value2;

    public DataClass(int id, String value1, String value2) {
        this.id = id;
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
    @Override
    public String toString(){
        return "ID: " + id + "  Value1: " + value1 + "  Value2: " + value2;
    }
}
