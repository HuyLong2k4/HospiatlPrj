package com.example.hospital_service.controller;

import com.example.hospital_service.dto.request.ApiResponse;
import com.example.hospital_service.dto.request.PatientCreateRequest;
import com.example.hospital_service.dto.request.PatientUpdateRequest;
import com.example.hospital_service.dto.response.PatientResponse;
import com.example.hospital_service.entity.Patient;
import com.example.hospital_service.service.PatientService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PatientController {
    PatientService patientService;

    @PostMapping
    ApiResponse<Patient> createPatient(@RequestBody @Valid PatientCreateRequest request) {
        ApiResponse<Patient> apiResponse = new ApiResponse<>();
        apiResponse.setResult(patientService.createPatient(request));

        return apiResponse;
    }

    @GetMapping
    List<Patient> getPatient(){
        return patientService.getPatients();
    }

    @GetMapping("/{patient_id}")
    PatientResponse getPatient(@PathVariable("patient_id") String patient_id) {
        return patientService.getPatient(patient_id);
    }

    @PutMapping("/{patient_id}")
    PatientResponse updatePatient(@PathVariable String patient_id, @RequestBody PatientUpdateRequest request){
        return patientService.updatePatient(patient_id, request);
    }

    @DeleteMapping("/{patient_id}")
    String deletePatient(@PathVariable String patient_id){
        patientService.deletePatient(patient_id);
        return "Patient has been deleted";
    }
}