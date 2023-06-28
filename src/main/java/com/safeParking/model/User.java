package com.safeParking.model;

import jakarta.persistence.*;

@Entity
@Table(name="cars")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String plateNUmber;
    private String ownerNames;
    private String contact;
    private String email;

    public User() {
    }

    public User(int id, String plateNUmber, String ownerNames, String contact, String email) {
        this.id = id;
        this.plateNUmber = plateNUmber;
        this.ownerNames = ownerNames;
        this.contact = contact;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlateNUmber() {
        return plateNUmber;
    }

    public void setPlateNUmber(String plateNUmber) {
        this.plateNUmber = plateNUmber;
    }

    public String getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String ownerNames) {
        this.ownerNames = ownerNames;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
