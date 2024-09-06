package com.example.hospital_service.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
public class SetCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String setCal_id;
    private LocalDate setDate;
    private Time setHour;
    private String note;
    private boolean status;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient_id;

    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor_id;

    @OneToOne
    @JoinColumn(name = "service_id")
    private Service service_id;

    public String getSetCal_id() {
        return setCal_id;
    }

    public void setSetCal_id(String setCal_id) {
        this.setCal_id = setCal_id;
    }

    public LocalDate getSetDate() {
        return setDate;
    }

    public void setSetDate(LocalDate setDate) {
        this.setDate = setDate;
    }

    public Time getSetHour() {
        return setHour;
    }

    public void setSetHour(Time setHour) {
        this.setHour = setHour;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
