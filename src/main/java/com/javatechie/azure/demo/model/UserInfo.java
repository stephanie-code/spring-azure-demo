package com.javatechie.azure.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "userinfotable")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String name;
    private String gender;
    private String city;
    private String rootprocinstid;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRootprocinstid() {
        return rootprocinstid;
    }

    public void setRootprocinstid(String rootprocinstid) {
        this.rootprocinstid = rootprocinstid;
    }
}

