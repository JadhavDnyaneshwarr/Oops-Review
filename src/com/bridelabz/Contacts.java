package com.bridelabz;

public class Contacts {

    private String name;
    private String age;
    private String phoneNumber;
    private String city;
    private String state;

    public Contacts(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return ("name: " + name + "\nage: " + age + "\nPhone Number: " + phoneNumber + "\ncity: " + city + "\nstate: " + state);
    }
}
