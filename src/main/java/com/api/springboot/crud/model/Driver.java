package com.api.springboot.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Driver {
    @Id
    String id;
    String firstName;
    String lastName;
    int age;
    String driverLicense;

    public Driver(String firstName, String lastName, int age, String driverLicense) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.driverLicense = driverLicense;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDrivingLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String toString() {
        return "Driver First Name:" + firstName + " Last Name:" + lastName + " age:" + age + " Driving License:" + driverLicense;
    }


}

