package com.example.hospital_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String recep_id;
    private String recpe_name;

    public String getRecpe_name() {
        return recpe_name;
    }

    public void setRecpe_name(String recpe_name) {
        this.recpe_name = recpe_name;
    }

    public String getRecep_id() {
        return recep_id;
    }

    public void setRecep_id(String recep_id) {
        this.recep_id = recep_id;
    }
}
