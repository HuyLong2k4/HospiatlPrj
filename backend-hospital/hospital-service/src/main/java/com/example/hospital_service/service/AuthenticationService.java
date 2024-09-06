package com.example.hospital_service.service;

import com.example.hospital_service.dto.request.AuthenticationRequest;
import com.example.hospital_service.entity.Patient;
import com.example.hospital_service.exception.AppException;
import com.example.hospital_service.exception.ErrorCode;
import com.example.hospital_service.repository.PatientRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationService {
    PatientRepository patientRepository;

    public boolean authenticate(AuthenticationRequest request){
        var patient = patientRepository.findByPatientname(request.getPatientname())
                .orElseThrow(() -> new AppException(ErrorCode.PATIENT_NOT_EXISTED));

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        return passwordEncoder.matches(request.getPassword(), patient.getPassword());
    }
}
