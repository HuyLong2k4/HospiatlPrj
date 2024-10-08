package com.example.hospital_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PatientCreateRequest {
    String patientname;

    @Size(min = 8, message = "Vui long nhap 8 ky tu")
    String password;
    String address;
    String phone;
    LocalDate dob;

}
