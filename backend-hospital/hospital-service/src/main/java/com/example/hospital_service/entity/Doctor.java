package com.example.hospital_service.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String doctor_id;
    String doctor_name;
    String password;
    String phone;
    LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "major_id")
    Major major_id;
}
