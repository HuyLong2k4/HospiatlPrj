package com.example.hospital_service.service;


import com.example.hospital_service.dto.request.PatientCreateRequest;
import com.example.hospital_service.dto.request.PatientUpdateRequest;
import com.example.hospital_service.entity.Patient;
import com.example.hospital_service.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(PatientCreateRequest request) {
        Patient patient = new Patient();

        patient.setPatient_name(request.getPatient_name());
        patient.setPassword(request.getPassword());
        patient.setDob(request.getDob());
        patient.setAddress(request.getAddress());
        patient.setPhone(request.getPhone());

        return patientRepository.save(patient);
    }

    public Patient updatePatient(String patient_id, PatientUpdateRequest request) {
        Patient patient = getPatient(patient_id);

        patient.setPassword(request.getPassword());
        patient.setDob(request.getDob());
        patient.setAddress(request.getAddress());
        patient.setPhone(request.getPhone());

        return patientRepository.save(patient);
    }

    public void deletePatient(String patient_id) {
        patientRepository.deleteById(patient_id);
    }
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatient(String patient_id) {
        return patientRepository.findById(patient_id).orElseThrow(() -> new RuntimeException("Patient not found"));
    }
}
