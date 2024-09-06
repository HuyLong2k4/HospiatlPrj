package com.example.hospital_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PatientResponse {
    String patient_id;
    String patientname;
    String password;
    String address;
    String phone;
    LocalDate dob;
}
