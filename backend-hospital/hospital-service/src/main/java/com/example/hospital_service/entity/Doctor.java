package com.example.hospital_service.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_id;
    private String doctor_name;
    private String password;
    private String phone;
    private LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "major_id")
    private Major major_id;

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Major getMajor_id() {
        return major_id;
    }

    public void setMajor_id(Major major_id) {
        this.major_id = major_id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
