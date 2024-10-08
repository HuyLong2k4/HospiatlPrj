package com.example.hospital_service.repository;


import com.example.hospital_service.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
    boolean existsByPatientname(String patientname);

    Optional<Patient> findByPatientname(String patientname);
}
