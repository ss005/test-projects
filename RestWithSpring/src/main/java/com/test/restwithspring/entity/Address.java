package com.test.restwithspring.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue
    int aid;
    String city;
    String state;
    String country;

    @ManyToMany(mappedBy = "addressSet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<User> userSet = new HashSet();


    public Address () {}

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return aid == address.aid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid);
    }
}
