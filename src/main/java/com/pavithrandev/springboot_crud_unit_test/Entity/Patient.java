package com.pavithrandev.springboot_crud_unit_test.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
//@Table(name="patient")
public class Patient {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
    //gender
    private String name;
    private LocalDate dob;
    private String city;
    private String address;
    private String email;
    private String phoneNo;

    @Override
    public String toString() {
        return "Patient{" +
              //  "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    public Patient( String name, LocalDate dob, String city, String address, String email, String phoneNo) {
      //  this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
