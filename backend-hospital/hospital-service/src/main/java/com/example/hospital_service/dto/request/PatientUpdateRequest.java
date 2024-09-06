package com.example.hospital_service.dto.request;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PatientUpdateRequest {
    String password;
    String address;
    String phone;
    LocalDate dob;

}
