package com.google;

public class Animal {
    private String type;
    private String gender;
    private String age;
    private String name;

    public Animal() {

    }

    public Animal(String name, String type, String gender, String age) {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
