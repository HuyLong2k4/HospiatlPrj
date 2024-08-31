package com.example.hospital_service.controller;

import com.example.hospital_service.dto.request.PatientCreateRequest;
import com.example.hospital_service.dto.request.PatientUpdateRequest;
import com.example.hospital_service.entity.Patient;
import com.example.hospital_service.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    Patient createPatient(@RequestBody PatientCreateRequest request) {
        return patientService.createPatient(request);
    }

    @GetMapping
    List<Patient> getPatient(){
        return patientService.getPatients();
    }

    @GetMapping("/{patient_id}")
    Patient getPatient(@PathVariable("patient_id") String patient_id) {
        return patientService.getPatient(patient_id);
    }

    @PutMapping("/{patient_id}")
    Patient updatePatient(@PathVariable String patient_id, @RequestBody PatientUpdateRequest request){
        return patientService.updatePatient(patient_id, request);
    }

    @DeleteMapping("/{patient_id}")
    String deletePatient(@PathVariable String patient_id){
        patientService.deletePatient(patient_id);
        return "Patient has been deleted";
    }
}