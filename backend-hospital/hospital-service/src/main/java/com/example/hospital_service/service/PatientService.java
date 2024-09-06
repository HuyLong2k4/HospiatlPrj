package com.example.hospital_service.service;


import com.example.hospital_service.dto.request.PatientCreateRequest;
import com.example.hospital_service.dto.request.PatientUpdateRequest;
import com.example.hospital_service.dto.response.PatientResponse;
import com.example.hospital_service.entity.Patient;
import com.example.hospital_service.exception.AppException;
import com.example.hospital_service.exception.ErrorCode;
import com.example.hospital_service.mapper.PatientMapper;
import com.example.hospital_service.repository.PatientRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PatientService {
    PatientRepository patientRepository;
    PatientMapper patientMapper;

    public Patient createPatient(PatientCreateRequest request) {

        if(patientRepository.existsByPatientname((request.getPatientname())))
            throw new AppException(ErrorCode.PATIENT_EXISTED);

        Patient patient = patientMapper.toPatient(request);

        return patientRepository.save(patient);
    }

    public PatientResponse updatePatient(String patient_id, PatientUpdateRequest request) {
        Patient patient = patientRepository.findById(patient_id).orElseThrow(() -> new RuntimeException("Patient not found"));
        patientMapper.updatePatient(patient, request);

        return patientMapper.toPatientResponse(patientRepository.save(patient));
    }

    public void deletePatient(String patient_id) {
        patientRepository.deleteById(patient_id);
    }
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public PatientResponse getPatient(String patient_id) {
        return patientMapper.toPatientResponse(patientRepository.findById(patient_id).orElseThrow(() -> new RuntimeException("Patient not found")));
    }
}
