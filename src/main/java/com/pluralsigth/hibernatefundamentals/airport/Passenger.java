package com.pluralsigth.hibernatefundamentals.airport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PASSENGERS")
public class Passager {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    public Passager() {
    }

    public Passager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
