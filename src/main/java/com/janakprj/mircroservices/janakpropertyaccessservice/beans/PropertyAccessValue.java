package com.janakprj.mircroservices.janakpropertyaccessservice.beans;

public class PropertyAccessValue {

    private String name;
    private String desc;

    public PropertyAccessValue(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PropertyAccessValue{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
